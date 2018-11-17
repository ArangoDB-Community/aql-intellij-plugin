package com.machak.aql.grammar;

import com.yourkit.util.Strings;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TokeGenerator {

    public static void main(String[] args) {
        final File file = new File("/home/machak/java/projects/aql/src/com/machak/aql/grammar/aql.y");
        Set<String> terms = new HashSet<>();

        try (BufferedReader r = Files.newBufferedReader(file.toPath())) {
            r.lines().forEach(t -> process(t, terms));
        } catch (IOException e) {

        }
        for (String term : terms) {
            System.out.print("\"" + term.split("=")[0].replaceAll("T_", "").trim() + "\",");
        }
    }

    private static void process(final String line, final Set<String> terms) {
        if (Strings.isNullOrEmpty(line)) {
            return;
        }
        Pattern keywordPattern = Pattern.compile("([A-Z_]*)\\s*\"([A-Z_])(.*)\"");
        final Matcher matcher = keywordPattern.matcher(line);
        if (matcher.matches()) {
            final String group = matcher.group(1);
            final String all = group + " = " + makeRegex(group);
            terms.add(all);
        } else {
            String cleaned = line.replaceAll("\\s*operator", "");
            cleaned = cleaned.replaceAll("\\s*modifier", "");
            cleaned = cleaned.replaceAll("\\s*operator", "");
            cleaned = cleaned.replaceAll("\\s*modifier", "");
            final String[] s = cleaned.split(" ");
            //System.out.println(s[0] +" = " + s[1]);
            // System.out.print("| "+s[0].trim() + "\n" );
        }

    }

    private static String makeRegex(final String group) {
        final String term = group.replaceAll("T_", "");
        final String termLower = term.toLowerCase();
        String reg = "\"regexp:";
        for (int i = 0; i < term.length(); i++) {
            reg += "([" + term.charAt(i) + termLower.charAt(i) + "])";

        }
        return reg + '"';
    }

}
