package com.arangodb.intellij.aql.util;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;

public final class JSON {

    private static final Logger log = LoggerFactory.getLogger(JSON.class);
    public static final ObjectMapper JSON = new ObjectMapper();


    public static final byte[] EMPTY_BYTES = new byte[0];

    static {
        JSON.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        // TODO enable for debugging
        JSON.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        JSON.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        JSON.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.NONE);
        // DEBUG ONLY
        //JSON.enable(SerializationFeature.INDENT_OUTPUT);
    }

    private JSON() {
    }


    public static <T> String toJson(final T object) {
        if (object == null) {
            return "";
        }

        try {
            return JSON.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            log.error("JSON error", e);
        }
        return "";
    }

    public static <T> byte[] toBytesJson(final T object) {
        if (object == null) {
            return EMPTY_BYTES;
        }

        try {
            return JSON.writeValueAsBytes(object);
        } catch (JsonProcessingException e) {
            log.error("JSON error", e);
        }
        return EMPTY_BYTES;
    }


    @Nullable
    public static <T> T fromJson(final byte[] message, Class<T> clazz) {
        try {
            return JSON.readValue(message, clazz);
        } catch (Exception e) {
            log.error("JSON error", e);
        }
        return null;
    }

    @Nullable
    public static <T> T fromJson(final String message, Class<T> clazz) {

        try {
            return JSON.readValue(message, clazz);
        } catch (Exception e) {
            log.error("JSON error (see message below)", e);
            log.error("{}", message);
        }
        return null;
    }

    public static <T> List<T> fromJson(final byte[] bytes, final TypeReference<List<T>> typeReference) {
        try {
            return JSON.readValue(bytes, typeReference);
        } catch (Exception e) {
            log.error("JSON error (see message below)", e);
        }
        return Collections.emptyList();
    }

    /*public static <T> List<T> fromJsonArray(final String json, final Class<T> clazz) {
        try {
            return JSON.readValue(json, JSON.getTypeFactory().constructCollectionType(List.class, clazz));
        } catch (IOException e) {
            // ignore
        }
        return null;
    }*/
}

