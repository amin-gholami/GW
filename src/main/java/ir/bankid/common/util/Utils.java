package ir.bankid.common.util;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Utils {

    public static Gson getGson() {
        GsonBuilder gsonBuilder = new GsonBuilder().addSerializationExclusionStrategy(new ExclusionStrategy() {
            @Override
            public boolean shouldSkipField(FieldAttributes f) {
                return f.getAnnotation(SkipSerialisationInSysLog.class) != null;
            }

            @Override
            public boolean shouldSkipClass(Class<?> clazz) {
                return false;
            }
        });
        new GraphAdapterBuilder().addType(Object.class).registerOn(gsonBuilder);
        return gsonBuilder.create();
    }
}
