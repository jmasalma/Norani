package androidx.work;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 A2\u00020\u0001:\u0002@AB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0002\u0010\u0003B\u0019\b\u0010\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u0006J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\u0006J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000e\u001a\u00020\u0006J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000e\u001a\u00020\u0006J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u001fJ\u0010\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u000e\u001a\u00020\u0006J\u0016\u0010\"\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020#J\u0010\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\u000e\u001a\u00020\u0006J*\u0010&\u001a\u0002H'\"\n\b\u0000\u0010'\u0018\u0001*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u0002H'H\b¢\u0006\u0002\u0010(J\u0010\u0010)\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0006J\u001b\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010+2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0002\u0010,J}\u0010-\u001a\u0004\u0018\u0001H.\"\n\b\u0000\u0010'\u0018\u0001*\u00020\u0001\"\u0004\b\u0001\u0010.2\u0006\u0010\u000e\u001a\u00020\u00062Q\u0010/\u001aM\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012.\u0012,\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(5\u0012\u0004\u0012\u0002H'04¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(6\u0012\u0004\u0012\u0002H.00H\b¢\u0006\u0002\u00107J\u001e\u00108\u001a\u00020\f\"\u0006\b\u0000\u0010'\u0018\u00012\u0006\u0010\u000e\u001a\u00020\u0006H\b¢\u0006\u0002\b9J\"\u0010:\u001a\u00020\f\"\u0004\b\u0000\u0010'2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010;\u001a\b\u0012\u0004\u0012\u0002H'0<J\b\u0010=\u001a\u00020\u001fH\u0016J\b\u00103\u001a\u00020\u001fH\u0007J\u0006\u0010>\u001a\u00020\u0015J\b\u0010?\u001a\u00020\u0006H\u0016R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Landroidx/work/Data;", "", "other", "(Landroidx/work/Data;)V", "values", "", "", "(Ljava/util/Map;)V", "keyValueMap", "getKeyValueMap", "()Ljava/util/Map;", "equals", "", "getBoolean", "key", "defaultValue", "getBooleanArray", "", "getByte", "", "getByteArray", "", "getDouble", "", "getDoubleArray", "", "getFloat", "", "getFloatArray", "", "getInt", "", "getIntArray", "", "getLong", "", "getLongArray", "", "getOrDefault", "T", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getString", "getStringArray", "", "(Ljava/lang/String;)[Ljava/lang/String;", "getTypedArray", "TArray", "constructor", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "size", "Lkotlin/Function1;", "index", "init", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "hasKey", "hasKey$work_runtime_release", "hasKeyWithValueOfType", "klass", "Ljava/lang/Class;", "hashCode", "toByteArray", "toString", "Builder", "Companion", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Data_.kt */
public final class Data {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final Data EMPTY = new Builder().build();
    public static final int MAX_DATA_BYTES = 10240;
    private static final String NULL_STRING_V1 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
    private static final short STREAM_MAGIC = -21521;
    private static final short STREAM_VERSION = 1;
    private static final byte TYPE_BOOLEAN = 1;
    private static final byte TYPE_BOOLEAN_ARRAY = 8;
    private static final byte TYPE_BYTE = 2;
    private static final byte TYPE_BYTE_ARRAY = 9;
    private static final byte TYPE_DOUBLE = 6;
    private static final byte TYPE_DOUBLE_ARRAY = 13;
    private static final byte TYPE_FLOAT = 5;
    private static final byte TYPE_FLOAT_ARRAY = 12;
    private static final byte TYPE_INTEGER = 3;
    private static final byte TYPE_INTEGER_ARRAY = 10;
    private static final byte TYPE_LONG = 4;
    private static final byte TYPE_LONG_ARRAY = 11;
    private static final byte TYPE_NULL = 0;
    private static final byte TYPE_STRING = 7;
    private static final byte TYPE_STRING_ARRAY = 14;
    /* access modifiers changed from: private */
    public final Map<String, Object> values;

    @JvmStatic
    public static final Data fromByteArray(byte[] bArr) {
        return Companion.fromByteArray(bArr);
    }

    @JvmStatic
    @Deprecated(message = "This is kept for testing migration", replaceWith = @ReplaceWith(expression = "toByteArrayInternalV1", imports = {}))
    public static final byte[] toByteArrayInternalV0(Data data) {
        return Companion.toByteArrayInternalV0(data);
    }

    @JvmStatic
    public static final byte[] toByteArrayInternalV1(Data data) {
        return Companion.toByteArrayInternalV1(data);
    }

    public Data(Data data) {
        Intrinsics.checkNotNullParameter(data, "other");
        this.values = new HashMap(data.values);
    }

    public Data(Map<String, ?> map) {
        Intrinsics.checkNotNullParameter(map, "values");
        this.values = new HashMap(map);
    }

    private final /* synthetic */ <T> T getOrDefault(String str, T t) {
        T t2 = this.values.get(str);
        Intrinsics.reifiedOperationMarker(3, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return t2 instanceof Object ? t2 : t;
    }

    private final /* synthetic */ <T, TArray> TArray getTypedArray(String str, Function2<? super Integer, ? super Function1<? super Integer, ? extends T>, ? extends TArray> function2) {
        Object obj = this.values.get(str);
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Object[]) {
                Integer valueOf = Integer.valueOf(objArr.length);
                Intrinsics.needClassReification();
                return function2.invoke(valueOf, new Data$getTypedArray$1(obj));
            }
        }
        return null;
    }

    public final boolean getBoolean(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "key");
        Object valueOf = Boolean.valueOf(z);
        Object obj = this.values.get(str);
        if (obj instanceof Boolean) {
            valueOf = obj;
        }
        return ((Boolean) valueOf).booleanValue();
    }

    public final byte getByte(String str, byte b) {
        Intrinsics.checkNotNullParameter(str, "key");
        Object valueOf = Byte.valueOf(b);
        Object obj = this.values.get(str);
        if (obj instanceof Byte) {
            valueOf = obj;
        }
        return ((Number) valueOf).byteValue();
    }

    public final int getInt(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "key");
        Object valueOf = Integer.valueOf(i);
        Object obj = this.values.get(str);
        if (obj instanceof Integer) {
            valueOf = obj;
        }
        return ((Number) valueOf).intValue();
    }

    public final long getLong(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "key");
        Object valueOf = Long.valueOf(j);
        Object obj = this.values.get(str);
        if (obj instanceof Long) {
            valueOf = obj;
        }
        return ((Number) valueOf).longValue();
    }

    public final float getFloat(String str, float f) {
        Intrinsics.checkNotNullParameter(str, "key");
        Object valueOf = Float.valueOf(f);
        Object obj = this.values.get(str);
        if (obj instanceof Float) {
            valueOf = obj;
        }
        return ((Number) valueOf).floatValue();
    }

    public final double getDouble(String str, double d) {
        Intrinsics.checkNotNullParameter(str, "key");
        Object valueOf = Double.valueOf(d);
        Object obj = this.values.get(str);
        if (obj instanceof Double) {
            valueOf = obj;
        }
        return ((Number) valueOf).doubleValue();
    }

    public final String getString(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        Object obj = this.values.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final Map<String, Object> getKeyValueMap() {
        Map<String, Object> unmodifiableMap = Collections.unmodifiableMap(this.values);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(values)");
        return unmodifiableMap;
    }

    public final byte[] toByteArray() {
        return Companion.toByteArrayInternalV1(this);
    }

    public final <T> boolean hasKeyWithValueOfType(String str, Class<T> cls) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(cls, "klass");
        Object obj = this.values.get(str);
        return obj != null && cls.isAssignableFrom(obj.getClass());
    }

    public final /* synthetic */ <T> boolean hasKey$work_runtime_release(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        Class<Object> cls = Object.class;
        Class cls2 = cls;
        return hasKeyWithValueOfType(str, cls);
    }

    public final int size() {
        return this.values.size();
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(getClass(), obj.getClass())) {
            return false;
        }
        Data data = (Data) obj;
        Set<String> keySet = this.values.keySet();
        if (!Intrinsics.areEqual(keySet, data.values.keySet())) {
            return false;
        }
        for (String next : keySet) {
            Object obj2 = this.values.get(next);
            Object obj3 = data.values.get(next);
            if (obj2 != null && obj3 != null) {
                if (obj2 instanceof Object[]) {
                    Object[] objArr = (Object[]) obj2;
                    if ((objArr instanceof Object[]) && (obj3 instanceof Object[])) {
                        Object[] objArr2 = (Object[]) obj3;
                        if (objArr2 instanceof Object[]) {
                            z = ArraysKt.contentDeepEquals(objArr, objArr2);
                            continue;
                        }
                    }
                }
                z = Intrinsics.areEqual(obj2, obj3);
                continue;
            } else if (obj2 == obj3) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        for (Map.Entry next : this.values.entrySet()) {
            Object value = next.getValue();
            if (value instanceof Object[]) {
                i = Objects.hashCode(next.getKey()) ^ ArraysKt.contentDeepHashCode((Object[]) value);
            } else {
                i = next.hashCode();
            }
            i2 += i;
        }
        return i2 * 31;
    }

    public String toString() {
        String str = "Data {" + CollectionsKt.joinToString$default(this.values.entrySet(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, Data$toString$1$content$1.INSTANCE, 31, (Object) null) + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\u001a\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0007J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0007J\u001c\u0010\u000b\u001a\u00020\u00002\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002J\u0016\u0010\u0017\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020 J\u0016\u0010!\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\"J\u0016\u0010#\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020$J\u0016\u0010%\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020&J\u0018\u0010'\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005J#\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050)¢\u0006\u0002\u0010*R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Landroidx/work/Data$Builder;", "", "()V", "values", "", "", "build", "Landroidx/work/Data;", "put", "key", "value", "putAll", "data", "", "putBoolean", "", "putBooleanArray", "", "putByte", "", "putByteArray", "", "putDirect", "putDouble", "", "putDoubleArray", "", "putFloat", "", "putFloatArray", "", "putInt", "", "putIntArray", "", "putLong", "", "putLongArray", "", "putString", "putStringArray", "", "(Ljava/lang/String;[Ljava/lang/String;)Landroidx/work/Data$Builder;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: Data_.kt */
    public static final class Builder {
        private final Map<String, Object> values = new LinkedHashMap();

        private final Builder putDirect(String str, Object obj) {
            this.values.put(str, obj);
            return this;
        }

        public final Builder putBoolean(String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "key");
            return putDirect(str, Boolean.valueOf(z));
        }

        public final Builder putBooleanArray(String str, boolean[] zArr) {
            Intrinsics.checkNotNullParameter(str, "key");
            Intrinsics.checkNotNullParameter(zArr, "value");
            this.values.put(str, Data_Kt.convertPrimitiveArray(zArr));
            return this;
        }

        public final Builder putByte(String str, byte b) {
            Intrinsics.checkNotNullParameter(str, "key");
            return putDirect(str, Byte.valueOf(b));
        }

        public final Builder putByteArray(String str, byte[] bArr) {
            Intrinsics.checkNotNullParameter(str, "key");
            Intrinsics.checkNotNullParameter(bArr, "value");
            this.values.put(str, Data_Kt.convertPrimitiveArray(bArr));
            return this;
        }

        public final Builder putInt(String str, int i) {
            Intrinsics.checkNotNullParameter(str, "key");
            return putDirect(str, Integer.valueOf(i));
        }

        public final Builder putIntArray(String str, int[] iArr) {
            Intrinsics.checkNotNullParameter(str, "key");
            Intrinsics.checkNotNullParameter(iArr, "value");
            this.values.put(str, Data_Kt.convertPrimitiveArray(iArr));
            return this;
        }

        public final Builder putLong(String str, long j) {
            Intrinsics.checkNotNullParameter(str, "key");
            return putDirect(str, Long.valueOf(j));
        }

        public final Builder putLongArray(String str, long[] jArr) {
            Intrinsics.checkNotNullParameter(str, "key");
            Intrinsics.checkNotNullParameter(jArr, "value");
            this.values.put(str, Data_Kt.convertPrimitiveArray(jArr));
            return this;
        }

        public final Builder putFloat(String str, float f) {
            Intrinsics.checkNotNullParameter(str, "key");
            return putDirect(str, Float.valueOf(f));
        }

        public final Builder putFloatArray(String str, float[] fArr) {
            Intrinsics.checkNotNullParameter(str, "key");
            Intrinsics.checkNotNullParameter(fArr, "value");
            this.values.put(str, Data_Kt.convertPrimitiveArray(fArr));
            return this;
        }

        public final Builder putDouble(String str, double d) {
            Intrinsics.checkNotNullParameter(str, "key");
            return putDirect(str, Double.valueOf(d));
        }

        public final Builder putDoubleArray(String str, double[] dArr) {
            Intrinsics.checkNotNullParameter(str, "key");
            Intrinsics.checkNotNullParameter(dArr, "value");
            this.values.put(str, Data_Kt.convertPrimitiveArray(dArr));
            return this;
        }

        public final Builder putString(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "key");
            return putDirect(str, str2);
        }

        public final Builder putStringArray(String str, String[] strArr) {
            Intrinsics.checkNotNullParameter(str, "key");
            Intrinsics.checkNotNullParameter(strArr, "value");
            return putDirect(str, strArr);
        }

        public final Builder putAll(Data data) {
            Intrinsics.checkNotNullParameter(data, "data");
            putAll((Map<String, ? extends Object>) data.values);
            return this;
        }

        public final Builder put(String str, Object obj) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            Intrinsics.checkNotNullParameter(str, "key");
            Map<String, Object> map = this.values;
            if (obj == null) {
                obj = null;
            } else {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(obj.getClass());
                boolean z13 = true;
                if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                    z = true;
                } else {
                    z = Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte.TYPE));
                }
                if (z) {
                    z2 = true;
                } else {
                    z2 = Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE));
                }
                if (z2) {
                    z3 = true;
                } else {
                    z3 = Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE));
                }
                if (z3) {
                    z4 = true;
                } else {
                    z4 = Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE));
                }
                if (z4) {
                    z5 = true;
                } else {
                    z5 = Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE));
                }
                if (z5) {
                    z6 = true;
                } else {
                    z6 = Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class));
                }
                if (z6) {
                    z7 = true;
                } else {
                    z7 = Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean[].class));
                }
                if (z7) {
                    z8 = true;
                } else {
                    z8 = Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Byte[].class));
                }
                if (z8) {
                    z9 = true;
                } else {
                    z9 = Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer[].class));
                }
                if (z9) {
                    z10 = true;
                } else {
                    z10 = Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long[].class));
                }
                if (z10) {
                    z11 = true;
                } else {
                    z11 = Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float[].class));
                }
                if (z11) {
                    z12 = true;
                } else {
                    z12 = Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double[].class));
                }
                if (!z12) {
                    z13 = Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String[].class));
                }
                if (!z13) {
                    if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(boolean[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((boolean[]) obj);
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(byte[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((byte[]) obj);
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(int[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((int[]) obj);
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(long[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((long[]) obj);
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(float[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((float[]) obj);
                    } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(double[].class))) {
                        obj = Data_Kt.convertPrimitiveArray((double[]) obj);
                    } else {
                        throw new IllegalArgumentException("Key " + str + " has invalid type " + orCreateKotlinClass);
                    }
                }
            }
            map.put(str, obj);
            return this;
        }

        public final Data build() {
            Data data = new Data((Map<String, ?>) this.values);
            Data.Companion.toByteArrayInternalV1(data);
            return data;
        }

        public final Builder putAll(Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(map, "values");
            for (Map.Entry next : map.entrySet()) {
                put((String) next.getKey(), next.getValue());
            }
            return this;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0010\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0004H\u0007J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0004H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\rXT¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Landroidx/work/Data$Companion;", "", "()V", "EMPTY", "Landroidx/work/Data;", "MAX_DATA_BYTES", "", "NULL_STRING_V1", "", "STREAM_MAGIC", "", "STREAM_VERSION", "TYPE_BOOLEAN", "", "TYPE_BOOLEAN_ARRAY", "TYPE_BYTE", "TYPE_BYTE_ARRAY", "TYPE_DOUBLE", "TYPE_DOUBLE_ARRAY", "TYPE_FLOAT", "TYPE_FLOAT_ARRAY", "TYPE_INTEGER", "TYPE_INTEGER_ARRAY", "TYPE_LONG", "TYPE_LONG_ARRAY", "TYPE_NULL", "TYPE_STRING", "TYPE_STRING_ARRAY", "fromByteArray", "bytes", "", "toByteArrayInternalV0", "data", "toByteArrayInternalV1", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: Data_.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            kotlin.io.CloseableKt.closeFinally(r2, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0075, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            kotlin.io.CloseableKt.closeFinally(r0, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x007c, code lost:
            throw r1;
         */
        @kotlin.jvm.JvmStatic
        @kotlin.Deprecated(message = "This is kept for testing migration", replaceWith = @kotlin.ReplaceWith(expression = "toByteArrayInternalV1", imports = {}))
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final byte[] toByteArrayInternalV0(androidx.work.Data r7) {
            /*
                r6 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x007d }
                r0.<init>()     // Catch:{ IOException -> 0x007d }
                java.io.Closeable r0 = (java.io.Closeable) r0     // Catch:{ IOException -> 0x007d }
                r1 = r0
                java.io.ByteArrayOutputStream r1 = (java.io.ByteArrayOutputStream) r1     // Catch:{ all -> 0x0076 }
                java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0076 }
                r3 = r1
                java.io.OutputStream r3 = (java.io.OutputStream) r3     // Catch:{ all -> 0x0076 }
                r2.<init>(r3)     // Catch:{ all -> 0x0076 }
                java.io.Closeable r2 = (java.io.Closeable) r2     // Catch:{ all -> 0x0076 }
                r3 = r2
                java.io.ObjectOutputStream r3 = (java.io.ObjectOutputStream) r3     // Catch:{ all -> 0x006f }
                int r4 = r7.size()     // Catch:{ all -> 0x006f }
                r3.writeInt(r4)     // Catch:{ all -> 0x006f }
                java.util.Map r7 = r7.values     // Catch:{ all -> 0x006f }
                java.util.Set r7 = r7.entrySet()     // Catch:{ all -> 0x006f }
                java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x006f }
            L_0x002f:
                boolean r4 = r7.hasNext()     // Catch:{ all -> 0x006f }
                if (r4 == 0) goto L_0x004c
                java.lang.Object r4 = r7.next()     // Catch:{ all -> 0x006f }
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x006f }
                java.lang.Object r5 = r4.getKey()     // Catch:{ all -> 0x006f }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x006f }
                java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x006f }
                r3.writeUTF(r5)     // Catch:{ all -> 0x006f }
                r3.writeObject(r4)     // Catch:{ all -> 0x006f }
                goto L_0x002f
            L_0x004c:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x006f }
                r7 = 0
                kotlin.io.CloseableKt.closeFinally(r2, r7)     // Catch:{ all -> 0x0076 }
                kotlin.io.CloseableKt.closeFinally(r0, r7)     // Catch:{ IOException -> 0x007d }
                int r7 = r1.size()     // Catch:{ IOException -> 0x007d }
                r0 = 10240(0x2800, float:1.4349E-41)
                if (r7 > r0) goto L_0x0067
                byte[] r7 = r1.toByteArray()     // Catch:{ IOException -> 0x007d }
                java.lang.String r0 = "{\n                val st…ByteArray()\n            }"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)     // Catch:{ IOException -> 0x007d }
                goto L_0x0090
            L_0x0067:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x007d }
                java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
                r7.<init>(r0)     // Catch:{ IOException -> 0x007d }
                throw r7     // Catch:{ IOException -> 0x007d }
            L_0x006f:
                r7 = move-exception
                throw r7     // Catch:{ all -> 0x0071 }
            L_0x0071:
                r1 = move-exception
                kotlin.io.CloseableKt.closeFinally(r2, r7)     // Catch:{ all -> 0x0076 }
                throw r1     // Catch:{ all -> 0x0076 }
            L_0x0076:
                r7 = move-exception
                throw r7     // Catch:{ all -> 0x0078 }
            L_0x0078:
                r1 = move-exception
                kotlin.io.CloseableKt.closeFinally(r0, r7)     // Catch:{ IOException -> 0x007d }
                throw r1     // Catch:{ IOException -> 0x007d }
            L_0x007d:
                r7 = move-exception
                java.lang.String r0 = androidx.work.Data_Kt.TAG
                androidx.work.Logger r1 = androidx.work.Logger.get()
                java.lang.String r2 = "Error in Data#toByteArray: "
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                r1.error(r0, r2, r7)
                r7 = 0
                byte[] r7 = new byte[r7]
            L_0x0090:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.Data.Companion.toByteArrayInternalV0(androidx.work.Data):byte[]");
        }

        private static final void toByteArrayInternalV1$writeHeader(DataOutputStream dataOutputStream) {
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Double} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.Double} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.lang.Float} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: java.lang.Float} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.lang.Long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: java.lang.Long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: java.lang.Integer} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: java.lang.Byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: java.lang.Byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: java.lang.Boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: java.lang.Boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r12v0 */
        /* JADX WARNING: type inference failed for: r12v25 */
        /* JADX WARNING: type inference failed for: r12v26 */
        /* JADX WARNING: type inference failed for: r12v27 */
        /* JADX WARNING: type inference failed for: r12v28 */
        /* JADX WARNING: type inference failed for: r12v29 */
        /* JADX WARNING: type inference failed for: r12v30 */
        /* JADX WARNING: type inference failed for: r12v31 */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static final void toByteArrayInternalV1$writeArray(java.io.DataOutputStream r14, java.lang.Object[] r15) {
            /*
                java.lang.Class r0 = r15.getClass()
                kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
                java.lang.Class<java.lang.Boolean[]> r1 = java.lang.Boolean[].class
                kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                r2 = 14
                r3 = 13
                r4 = 12
                r5 = 11
                r6 = 10
                r7 = 9
                r8 = 8
                if (r1 == 0) goto L_0x0024
                r0 = r8
                goto L_0x0077
            L_0x0024:
                java.lang.Class<java.lang.Byte[]> r1 = java.lang.Byte[].class
                kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r1 == 0) goto L_0x0032
                r0 = r7
                goto L_0x0077
            L_0x0032:
                java.lang.Class<java.lang.Integer[]> r1 = java.lang.Integer[].class
                kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r1 == 0) goto L_0x0040
                r0 = r6
                goto L_0x0077
            L_0x0040:
                java.lang.Class<java.lang.Long[]> r1 = java.lang.Long[].class
                kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r1 == 0) goto L_0x004e
                r0 = r5
                goto L_0x0077
            L_0x004e:
                java.lang.Class<java.lang.Float[]> r1 = java.lang.Float[].class
                kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r1 == 0) goto L_0x005c
                r0 = r4
                goto L_0x0077
            L_0x005c:
                java.lang.Class<java.lang.Double[]> r1 = java.lang.Double[].class
                kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r1 == 0) goto L_0x006a
                r0 = r3
                goto L_0x0077
            L_0x006a:
                java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                kotlin.reflect.KClass r1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1)
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L_0x011d
                r0 = r2
            L_0x0077:
                r14.writeByte(r0)
                int r1 = r15.length
                r14.writeInt(r1)
                int r1 = r15.length
                r9 = 0
                r10 = r9
            L_0x0081:
                if (r10 >= r1) goto L_0x011c
                r11 = r15[r10]
                r12 = 0
                if (r0 != r8) goto L_0x009c
                boolean r13 = r11 instanceof java.lang.Boolean
                if (r13 == 0) goto L_0x008f
                r12 = r11
                java.lang.Boolean r12 = (java.lang.Boolean) r12
            L_0x008f:
                if (r12 == 0) goto L_0x0096
                boolean r11 = r12.booleanValue()
                goto L_0x0097
            L_0x0096:
                r11 = r9
            L_0x0097:
                r14.writeBoolean(r11)
                goto L_0x0118
            L_0x009c:
                if (r0 != r7) goto L_0x00b2
                boolean r13 = r11 instanceof java.lang.Byte
                if (r13 == 0) goto L_0x00a5
                r12 = r11
                java.lang.Byte r12 = (java.lang.Byte) r12
            L_0x00a5:
                if (r12 == 0) goto L_0x00ac
                byte r11 = r12.byteValue()
                goto L_0x00ad
            L_0x00ac:
                r11 = r9
            L_0x00ad:
                r14.writeByte(r11)
                goto L_0x0118
            L_0x00b2:
                if (r0 != r6) goto L_0x00c7
                boolean r13 = r11 instanceof java.lang.Integer
                if (r13 == 0) goto L_0x00bb
                r12 = r11
                java.lang.Integer r12 = (java.lang.Integer) r12
            L_0x00bb:
                if (r12 == 0) goto L_0x00c2
                int r11 = r12.intValue()
                goto L_0x00c3
            L_0x00c2:
                r11 = r9
            L_0x00c3:
                r14.writeInt(r11)
                goto L_0x0118
            L_0x00c7:
                if (r0 != r5) goto L_0x00dd
                boolean r13 = r11 instanceof java.lang.Long
                if (r13 == 0) goto L_0x00d0
                r12 = r11
                java.lang.Long r12 = (java.lang.Long) r12
            L_0x00d0:
                if (r12 == 0) goto L_0x00d7
                long r11 = r12.longValue()
                goto L_0x00d9
            L_0x00d7:
                r11 = 0
            L_0x00d9:
                r14.writeLong(r11)
                goto L_0x0118
            L_0x00dd:
                if (r0 != r4) goto L_0x00f2
                boolean r13 = r11 instanceof java.lang.Float
                if (r13 == 0) goto L_0x00e6
                r12 = r11
                java.lang.Float r12 = (java.lang.Float) r12
            L_0x00e6:
                if (r12 == 0) goto L_0x00ed
                float r11 = r12.floatValue()
                goto L_0x00ee
            L_0x00ed:
                r11 = 0
            L_0x00ee:
                r14.writeFloat(r11)
                goto L_0x0118
            L_0x00f2:
                if (r0 != r3) goto L_0x0108
                boolean r13 = r11 instanceof java.lang.Double
                if (r13 == 0) goto L_0x00fb
                r12 = r11
                java.lang.Double r12 = (java.lang.Double) r12
            L_0x00fb:
                if (r12 == 0) goto L_0x0102
                double r11 = r12.doubleValue()
                goto L_0x0104
            L_0x0102:
                r11 = 0
            L_0x0104:
                r14.writeDouble(r11)
                goto L_0x0118
            L_0x0108:
                if (r0 != r2) goto L_0x0118
                boolean r13 = r11 instanceof java.lang.String
                if (r13 == 0) goto L_0x0111
                r12 = r11
                java.lang.String r12 = (java.lang.String) r12
            L_0x0111:
                if (r12 != 0) goto L_0x0115
                java.lang.String r12 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d"
            L_0x0115:
                r14.writeUTF(r12)
            L_0x0118:
                int r10 = r10 + 1
                goto L_0x0081
            L_0x011c:
                return
            L_0x011d:
                java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Unsupported value type "
                r0.<init>(r1)
                java.lang.Class r15 = r15.getClass()
                kotlin.reflect.KClass r15 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r15)
                java.lang.String r15 = r15.getQualifiedName()
                java.lang.StringBuilder r15 = r0.append(r15)
                java.lang.String r15 = r15.toString()
                r14.<init>(r15)
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.Data.Companion.toByteArrayInternalV1$writeArray(java.io.DataOutputStream, java.lang.Object[]):void");
        }

        private static final void toByteArrayInternalV1$writeEntry(DataOutputStream dataOutputStream, String str, Object obj) {
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else if (obj instanceof Object[]) {
                toByteArrayInternalV1$writeArray(dataOutputStream, (Object[]) obj);
            } else {
                throw new IllegalArgumentException("Unsupported value type " + Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName());
            }
            dataOutputStream.writeUTF(str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            kotlin.io.CloseableKt.closeFinally(r1, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
            throw r0;
         */
        @kotlin.jvm.JvmStatic
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final byte[] toByteArrayInternalV1(androidx.work.Data r6) {
            /*
                r5 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0073 }
                r0.<init>()     // Catch:{ IOException -> 0x0073 }
                java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0073 }
                r2 = r0
                java.io.OutputStream r2 = (java.io.OutputStream) r2     // Catch:{ IOException -> 0x0073 }
                r1.<init>(r2)     // Catch:{ IOException -> 0x0073 }
                java.io.Closeable r1 = (java.io.Closeable) r1     // Catch:{ IOException -> 0x0073 }
                r2 = r1
                java.io.DataOutputStream r2 = (java.io.DataOutputStream) r2     // Catch:{ all -> 0x006c }
                toByteArrayInternalV1$writeHeader(r2)     // Catch:{ all -> 0x006c }
                int r3 = r6.size()     // Catch:{ all -> 0x006c }
                r2.writeInt(r3)     // Catch:{ all -> 0x006c }
                java.util.Map r6 = r6.values     // Catch:{ all -> 0x006c }
                java.util.Set r6 = r6.entrySet()     // Catch:{ all -> 0x006c }
                java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x006c }
            L_0x002d:
                boolean r3 = r6.hasNext()     // Catch:{ all -> 0x006c }
                if (r3 == 0) goto L_0x0047
                java.lang.Object r3 = r6.next()     // Catch:{ all -> 0x006c }
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x006c }
                java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x006c }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x006c }
                java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x006c }
                toByteArrayInternalV1$writeEntry(r2, r4, r3)     // Catch:{ all -> 0x006c }
                goto L_0x002d
            L_0x0047:
                r2.flush()     // Catch:{ all -> 0x006c }
                int r6 = r2.size()     // Catch:{ all -> 0x006c }
                r2 = 10240(0x2800, float:1.4349E-41)
                if (r6 > r2) goto L_0x0060
                byte[] r6 = r0.toByteArray()     // Catch:{ all -> 0x006c }
                r0 = 0
                kotlin.io.CloseableKt.closeFinally(r1, r0)     // Catch:{ IOException -> 0x0073 }
                java.lang.String r0 = "{\n                ByteAr…          }\n            }"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)     // Catch:{ IOException -> 0x0073 }
                goto L_0x0086
            L_0x0060:
                java.lang.String r6 = "Data cannot occupy more than 10240 bytes when serialized"
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006c }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x006c }
                r0.<init>(r6)     // Catch:{ all -> 0x006c }
                throw r0     // Catch:{ all -> 0x006c }
            L_0x006c:
                r6 = move-exception
                throw r6     // Catch:{ all -> 0x006e }
            L_0x006e:
                r0 = move-exception
                kotlin.io.CloseableKt.closeFinally(r1, r6)     // Catch:{ IOException -> 0x0073 }
                throw r0     // Catch:{ IOException -> 0x0073 }
            L_0x0073:
                r6 = move-exception
                java.lang.String r0 = androidx.work.Data_Kt.TAG
                androidx.work.Logger r1 = androidx.work.Logger.get()
                java.lang.String r2 = "Error in Data#toByteArray: "
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                r1.error(r0, r2, r6)
                r6 = 0
                byte[] r6 = new byte[r6]
            L_0x0086:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.Data.Companion.toByteArrayInternalV1(androidx.work.Data):byte[]");
        }

        private static final boolean fromByteArray$isObjectStream(ByteArrayInputStream byteArrayInputStream) {
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            byte b = (byte) -21267;
            boolean z = false;
            if (bArr[0] == ((byte) 16777132) && bArr[1] == b) {
                z = true;
            }
            byteArrayInputStream.reset();
            return z;
        }

        private static final void fromByteArray$readHeader(DataInputStream dataInputStream) {
            short readShort = dataInputStream.readShort();
            if (readShort == -21521) {
                short readShort2 = dataInputStream.readShort();
                if (readShort2 != 1) {
                    throw new IllegalStateException(("Unsupported version number: " + readShort2).toString());
                }
                return;
            }
            throw new IllegalStateException(("Magic number doesn't match: " + readShort).toString());
        }

        private static final Object fromByteArray$readValue(DataInputStream dataInputStream, byte b) {
            if (b == 0) {
                return null;
            }
            if (b == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b == 7) {
                return dataInputStream.readUTF();
            }
            int i = 0;
            if (b == 8) {
                int readInt = dataInputStream.readInt();
                Boolean[] boolArr = new Boolean[readInt];
                while (i < readInt) {
                    boolArr[i] = Boolean.valueOf(dataInputStream.readBoolean());
                    i++;
                }
                return (Serializable) boolArr;
            } else if (b == 9) {
                int readInt2 = dataInputStream.readInt();
                Byte[] bArr = new Byte[readInt2];
                while (i < readInt2) {
                    bArr[i] = Byte.valueOf(dataInputStream.readByte());
                    i++;
                }
                return (Serializable) bArr;
            } else if (b == 10) {
                int readInt3 = dataInputStream.readInt();
                Integer[] numArr = new Integer[readInt3];
                while (i < readInt3) {
                    numArr[i] = Integer.valueOf(dataInputStream.readInt());
                    i++;
                }
                return (Serializable) numArr;
            } else if (b == 11) {
                int readInt4 = dataInputStream.readInt();
                Long[] lArr = new Long[readInt4];
                while (i < readInt4) {
                    lArr[i] = Long.valueOf(dataInputStream.readLong());
                    i++;
                }
                return (Serializable) lArr;
            } else if (b == 12) {
                int readInt5 = dataInputStream.readInt();
                Float[] fArr = new Float[readInt5];
                while (i < readInt5) {
                    fArr[i] = Float.valueOf(dataInputStream.readFloat());
                    i++;
                }
                return (Serializable) fArr;
            } else if (b == 13) {
                int readInt6 = dataInputStream.readInt();
                Double[] dArr = new Double[readInt6];
                while (i < readInt6) {
                    dArr[i] = Double.valueOf(dataInputStream.readDouble());
                    i++;
                }
                return (Serializable) dArr;
            } else if (b == 14) {
                int readInt7 = dataInputStream.readInt();
                String[] strArr = new String[readInt7];
                while (i < readInt7) {
                    String readUTF = dataInputStream.readUTF();
                    if (Intrinsics.areEqual(readUTF, Data.NULL_STRING_V1)) {
                        readUTF = null;
                    }
                    strArr[i] = readUTF;
                    i++;
                }
                return (Serializable) strArr;
            } else {
                throw new IllegalStateException("Unsupported type " + b);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            kotlin.io.CloseableKt.closeFinally(r10, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
            throw r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0088, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
            kotlin.io.CloseableKt.closeFinally(r10, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x008c, code lost:
            throw r3;
         */
        @kotlin.jvm.JvmStatic
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.work.Data fromByteArray(byte[] r10) {
            /*
                r9 = this;
                java.lang.String r0 = "Error in Data#fromByteArray: "
                java.lang.String r1 = "bytes"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
                int r1 = r10.length
                r2 = 10240(0x2800, float:1.4349E-41)
                if (r1 > r2) goto L_0x00b0
                int r1 = r10.length
                if (r1 != 0) goto L_0x0012
                androidx.work.Data r10 = androidx.work.Data.EMPTY
                return r10
            L_0x0012:
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                java.util.Map r1 = (java.util.Map) r1
                java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x008d }
                r2.<init>(r10)     // Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x008d }
                boolean r10 = fromByteArray$isObjectStream(r2)     // Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x008d }
                r3 = 0
                r4 = 0
                if (r10 == 0) goto L_0x0056
                java.io.ObjectInputStream r10 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x008d }
                java.io.InputStream r2 = (java.io.InputStream) r2     // Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x008d }
                r10.<init>(r2)     // Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x008d }
                java.io.Closeable r10 = (java.io.Closeable) r10     // Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x008d }
                r2 = r10
                java.io.ObjectInputStream r2 = (java.io.ObjectInputStream) r2     // Catch:{ all -> 0x004f }
                int r5 = r2.readInt()     // Catch:{ all -> 0x004f }
            L_0x0036:
                if (r3 >= r5) goto L_0x004b
                java.lang.String r6 = r2.readUTF()     // Catch:{ all -> 0x004f }
                java.lang.String r7 = "readUTF()"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)     // Catch:{ all -> 0x004f }
                java.lang.Object r7 = r2.readObject()     // Catch:{ all -> 0x004f }
                r1.put(r6, r7)     // Catch:{ all -> 0x004f }
                int r3 = r3 + 1
                goto L_0x0036
            L_0x004b:
                kotlin.io.CloseableKt.closeFinally(r10, r4)     // Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x008d }
                goto L_0x00aa
            L_0x004f:
                r2 = move-exception
                throw r2     // Catch:{ all -> 0x0051 }
            L_0x0051:
                r3 = move-exception
                kotlin.io.CloseableKt.closeFinally(r10, r2)     // Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x008d }
                throw r3     // Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x008d }
            L_0x0056:
                java.io.DataInputStream r10 = new java.io.DataInputStream     // Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x008d }
                java.io.InputStream r2 = (java.io.InputStream) r2     // Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x008d }
                r10.<init>(r2)     // Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x008d }
                java.io.Closeable r10 = (java.io.Closeable) r10     // Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x008d }
                r2 = r10
                java.io.DataInputStream r2 = (java.io.DataInputStream) r2     // Catch:{ all -> 0x0086 }
                fromByteArray$readHeader(r2)     // Catch:{ all -> 0x0086 }
                int r5 = r2.readInt()     // Catch:{ all -> 0x0086 }
            L_0x0069:
                if (r3 >= r5) goto L_0x0082
                byte r6 = r2.readByte()     // Catch:{ all -> 0x0086 }
                java.lang.Object r6 = fromByteArray$readValue(r2, r6)     // Catch:{ all -> 0x0086 }
                java.lang.String r7 = r2.readUTF()     // Catch:{ all -> 0x0086 }
                java.lang.String r8 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)     // Catch:{ all -> 0x0086 }
                r1.put(r7, r6)     // Catch:{ all -> 0x0086 }
                int r3 = r3 + 1
                goto L_0x0069
            L_0x0082:
                kotlin.io.CloseableKt.closeFinally(r10, r4)     // Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x008d }
                goto L_0x00aa
            L_0x0086:
                r2 = move-exception
                throw r2     // Catch:{ all -> 0x0088 }
            L_0x0088:
                r3 = move-exception
                kotlin.io.CloseableKt.closeFinally(r10, r2)     // Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x008d }
                throw r3     // Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x008d }
            L_0x008d:
                r10 = move-exception
                java.lang.String r2 = androidx.work.Data_Kt.TAG
                androidx.work.Logger r3 = androidx.work.Logger.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                r3.error(r2, r0, r10)
                goto L_0x00aa
            L_0x009c:
                r10 = move-exception
                java.lang.String r2 = androidx.work.Data_Kt.TAG
                androidx.work.Logger r3 = androidx.work.Logger.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                r3.error(r2, r0, r10)
            L_0x00aa:
                androidx.work.Data r10 = new androidx.work.Data
                r10.<init>((java.util.Map<java.lang.String, ?>) r1)
                return r10
            L_0x00b0:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
                java.lang.String r0 = r0.toString()
                r10.<init>(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.Data.Companion.fromByteArray(byte[]):androidx.work.Data");
        }
    }

    public final boolean[] getBooleanArray(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        Object obj = this.values.get(str);
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Object[]) {
                int length = objArr.length;
                Function1 data$getBooleanArray$$inlined$getTypedArray$1 = new Data$getBooleanArray$$inlined$getTypedArray$1(obj);
                boolean[] zArr = new boolean[length];
                for (int i = 0; i < length; i++) {
                    zArr[i] = ((Boolean) data$getBooleanArray$$inlined$getTypedArray$1.invoke(Integer.valueOf(i))).booleanValue();
                }
                return zArr;
            }
        }
        return null;
    }

    public final byte[] getByteArray(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        Object obj = this.values.get(str);
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Object[]) {
                int length = objArr.length;
                Function1 data$getByteArray$$inlined$getTypedArray$1 = new Data$getByteArray$$inlined$getTypedArray$1(obj);
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    bArr[i] = ((Number) data$getByteArray$$inlined$getTypedArray$1.invoke(Integer.valueOf(i))).byteValue();
                }
                return bArr;
            }
        }
        return null;
    }

    public final int[] getIntArray(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        Object obj = this.values.get(str);
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Object[]) {
                int length = objArr.length;
                Function1 data$getIntArray$$inlined$getTypedArray$1 = new Data$getIntArray$$inlined$getTypedArray$1(obj);
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    iArr[i] = ((Number) data$getIntArray$$inlined$getTypedArray$1.invoke(Integer.valueOf(i))).intValue();
                }
                return iArr;
            }
        }
        return null;
    }

    public final long[] getLongArray(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        Object obj = this.values.get(str);
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Object[]) {
                int length = objArr.length;
                Function1 data$getLongArray$$inlined$getTypedArray$1 = new Data$getLongArray$$inlined$getTypedArray$1(obj);
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = ((Number) data$getLongArray$$inlined$getTypedArray$1.invoke(Integer.valueOf(i))).longValue();
                }
                return jArr;
            }
        }
        return null;
    }

    public final float[] getFloatArray(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        Object obj = this.values.get(str);
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Object[]) {
                int length = objArr.length;
                Function1 data$getFloatArray$$inlined$getTypedArray$1 = new Data$getFloatArray$$inlined$getTypedArray$1(obj);
                float[] fArr = new float[length];
                for (int i = 0; i < length; i++) {
                    fArr[i] = ((Number) data$getFloatArray$$inlined$getTypedArray$1.invoke(Integer.valueOf(i))).floatValue();
                }
                return fArr;
            }
        }
        return null;
    }

    public final double[] getDoubleArray(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        Object obj = this.values.get(str);
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Object[]) {
                int length = objArr.length;
                Function1 data$getDoubleArray$$inlined$getTypedArray$1 = new Data$getDoubleArray$$inlined$getTypedArray$1(obj);
                double[] dArr = new double[length];
                for (int i = 0; i < length; i++) {
                    dArr[i] = ((Number) data$getDoubleArray$$inlined$getTypedArray$1.invoke(Integer.valueOf(i))).doubleValue();
                }
                return dArr;
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String[] getStringArray(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.values
            java.lang.Object r5 = r0.get(r5)
            boolean r0 = r5 instanceof java.lang.Object[]
            if (r0 == 0) goto L_0x0030
            r0 = r5
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            boolean r1 = r0 instanceof java.lang.Object[]
            if (r1 == 0) goto L_0x0030
            int r0 = r0.length
            androidx.work.Data$getStringArray$$inlined$getTypedArray$1 r1 = new androidx.work.Data$getStringArray$$inlined$getTypedArray$1
            r1.<init>(r5)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.String[] r5 = new java.lang.String[r0]
            r2 = 0
        L_0x0021:
            if (r2 >= r0) goto L_0x0031
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r1.invoke(r3)
            r5[r2] = r3
            int r2 = r2 + 1
            goto L_0x0021
        L_0x0030:
            r5 = 0
        L_0x0031:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.Data.getStringArray(java.lang.String):java.lang.String[]");
    }
}
