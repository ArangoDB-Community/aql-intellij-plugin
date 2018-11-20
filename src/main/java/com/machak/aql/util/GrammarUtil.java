
package com.machak.aql.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class GrammarUtil {

    private GrammarUtil() {
    }

    public static void main(String[] args) throws IOException {
        final InputStream stream = GrammarUtil.class.getResourceAsStream("/lang/builtin.json");
        final ObjectMapper mapper = new ObjectMapper();
        final Reader reader = new InputStreamReader(stream);
        final Holder holder = mapper.readValue(reader, Holder.class);
        final List<BuiltInAqlFunction> functions = holder.functions;
        final Set<String> all = new HashSet<>();
        for (BuiltInAqlFunction function : functions) {
            final String name = function.name.trim();
            if (name.isEmpty() || name.startsWith("_")) {
                continue;
            }
            final String tokenName = printFunctionToken(name);
            all.add(tokenName);
        }
        printBnf(all);
        reader.close();
    }

    private static void printBnf(final Set<String> all) {
        String start = "KeywordFunctions ::=  ";
        for (String name : all) {
            start += name + "\n                        | ";
        }
        System.out.println(start);
    }

    private static String printFunctionToken(final String name) {
        final String lowerCase = name.toLowerCase();
        final String tokenName = "F_" + name;
        String rex = tokenName + " = \"regexp:";
        for (int i = 0; i < name.length(); i++) {
            final char lowerC = lowerCase.charAt(i);
            final char upperC = name.charAt(i);
            final String chars = lowerC == upperC ? String.valueOf(upperC) : String.valueOf(upperC) + lowerC;
            rex += "([" + chars + "])";

        }
        ;
        rex += '"';
        System.out.println(rex);
        return tokenName;
    }

    private static class Holder {
        public Holder() {
        }

        public List<BuiltInAqlFunction> functions;
    }

    private static class BuiltInAqlFunction {
        public String name;
        public String arguments;
        public boolean deterministic;
        public boolean cacheable;
        public boolean canRunOnDBServer;
        @JsonIgnore
        public Object implementations;

    }


}
