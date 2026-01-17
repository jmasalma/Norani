package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzb;
import com.google.android.gms.internal.ads.zzgzh;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public abstract class zzgzh<MessageType extends zzgzh<MessageType, BuilderType>, BuilderType extends zzgzb<MessageType, BuilderType>> extends zzgxi<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, zzgzh<?, ?>> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected zzhby zzt = zzhby.zzc();

    protected static zzgzj zzbA() {
        return zzgxp.zzd();
    }

    protected static zzgzj zzbB(zzgzj zzgzj) {
        int size = zzgzj.size();
        return zzgzj.zze(size + size);
    }

    protected static zzgzk zzbC() {
        return zzgyo.zze();
    }

    protected static zzgzk zzbD(zzgzk zzgzk) {
        int size = zzgzk.size();
        return zzgzk.zzg(size + size);
    }

    protected static zzgzo zzbE() {
        return zzgyy.zze();
    }

    protected static zzgzo zzbF(zzgzo zzgzo) {
        int size = zzgzo.size();
        return zzgzo.zzg(size + size);
    }

    protected static zzgzp zzbG() {
        return zzgzi.zzg();
    }

    protected static zzgzp zzbH(zzgzp zzgzp) {
        int size = zzgzp.size();
        return zzgzp.zzh(size + size);
    }

    protected static zzgzs zzbI() {
        return zzhah.zzh();
    }

    protected static zzgzs zzbJ(zzgzs zzgzs) {
        int size = zzgzs.size();
        return zzgzs.zze(size + size);
    }

    protected static <E> zzgzt<E> zzbK() {
        return zzhbd.zzd();
    }

    protected static <E> zzgzt<E> zzbL(zzgzt<E> zzgzt) {
        int size = zzgzt.size();
        return zzgzt.zzf(size + size);
    }

    static Object zzbP(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static Object zzbQ(zzhas zzhas, String str, Object[] objArr) {
        return new zzhbe(zzhas, str, objArr);
    }

    static Method zzbR(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            throw new RuntimeException("Generated message class \"" + name + "\" missing method \"" + str + "\".", e);
        }
    }

    protected static <T extends zzgzh> void zzbZ(Class<T> cls, T t) {
        t.zzbV();
        zzc.put(cls, t);
    }

    public static <ContainingType extends zzhas, Type> zzgzf<ContainingType, Type> zzbe(ContainingType containingtype, zzhas zzhas, zzgzm zzgzm, int i, zzhck zzhck, boolean z, Class cls) {
        return new zzgzf(containingtype, zzhbd.zzd(), zzhas, new zzgze(zzgzm, i, zzhck, true, z), cls);
    }

    public static <ContainingType extends zzhas, Type> zzgzf<ContainingType, Type> zzbf(ContainingType containingtype, Type type, zzhas zzhas, zzgzm zzgzm, int i, zzhck zzhck, Class cls) {
        return new zzgzf(containingtype, type, zzhas, new zzgze(zzgzm, i, zzhck, false, false), cls);
    }

    static <T extends zzgzh> T zzbh(Class<T> cls) {
        T t = (zzgzh) zzc.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzgzh) zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = ((zzgzh) zzhce.zzg(cls)).zzbt();
            if (t != null) {
                zzc.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static <T extends zzgzh<T, ?>> T zzbk(T t, InputStream inputStream) throws zzgzw {
        int i = zzgyr.zzb;
        int i2 = zzhbc.zza;
        T zzg = zzg(t, inputStream, zzgyr.zza);
        zzf(zzg);
        return zzg;
    }

    protected static <T extends zzgzh<T, ?>> T zzbl(T t, InputStream inputStream, zzgyr zzgyr) throws zzgzw {
        T zzg = zzg(t, inputStream, zzgyr);
        zzf(zzg);
        return zzg;
    }

    protected static <T extends zzgzh<T, ?>> T zzbm(T t, zzgxz zzgxz) throws zzgzw {
        int i = zzgyr.zzb;
        int i2 = zzhbc.zza;
        T zzbr = zzbr(t, zzgxz, zzgyr.zza);
        zzf(zzbr);
        return zzbr;
    }

    protected static <T extends zzgzh<T, ?>> T zzbn(T t, zzgyf zzgyf) throws zzgzw {
        int i = zzgyr.zzb;
        int i2 = zzhbc.zza;
        return zzbs(t, zzgyf, zzgyr.zza);
    }

    protected static <T extends zzgzh<T, ?>> T zzbo(T t, InputStream inputStream) throws zzgzw {
        zzgyf zzG = zzgyf.zzG(inputStream, ConstantsKt.DEFAULT_BLOCK_SIZE);
        int i = zzgyr.zzb;
        int i2 = zzhbc.zza;
        T zzbz = zzbz(t, zzG, zzgyr.zza);
        zzf(zzbz);
        return zzbz;
    }

    protected static <T extends zzgzh<T, ?>> T zzbp(T t, ByteBuffer byteBuffer) throws zzgzw {
        int i = zzgyr.zzb;
        int i2 = zzhbc.zza;
        return zzbv(t, byteBuffer, zzgyr.zza);
    }

    protected static <T extends zzgzh<T, ?>> T zzbq(T t, byte[] bArr) throws zzgzw {
        int length = bArr.length;
        int i = zzgyr.zzb;
        int i2 = zzhbc.zza;
        T zzi = zzi(t, bArr, 0, length, zzgyr.zza);
        zzf(zzi);
        return zzi;
    }

    protected static <T extends zzgzh<T, ?>> T zzbr(T t, zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        T zzh = zzh(t, zzgxz, zzgyr);
        zzf(zzh);
        return zzh;
    }

    protected static <T extends zzgzh<T, ?>> T zzbs(T t, zzgyf zzgyf, zzgyr zzgyr) throws zzgzw {
        T zzbz = zzbz(t, zzgyf, zzgyr);
        zzf(zzbz);
        return zzbz;
    }

    protected static <T extends zzgzh<T, ?>> T zzbu(T t, InputStream inputStream, zzgyr zzgyr) throws zzgzw {
        T zzbz = zzbz(t, zzgyf.zzG(inputStream, ConstantsKt.DEFAULT_BLOCK_SIZE), zzgyr);
        zzf(zzbz);
        return zzbz;
    }

    protected static <T extends zzgzh<T, ?>> T zzbv(T t, ByteBuffer byteBuffer, zzgyr zzgyr) throws zzgzw {
        zzgyf zzgyf;
        int i = zzgyf.zze;
        if (byteBuffer.hasArray()) {
            zzgyf = zzgyf.zzH(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        } else {
            if (byteBuffer.isDirect()) {
                int i2 = zzgyd.zza;
                if (zzhce.zzB()) {
                    zzgyf = new zzgyd(byteBuffer, false, (zzgye) null);
                }
            }
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            zzgyf = zzgyf.zzH(bArr, 0, remaining, true);
        }
        T zzbs = zzbs(t, zzgyf, zzgyr);
        zzf(zzbs);
        return zzbs;
    }

    protected static <T extends zzgzh<T, ?>> T zzbx(T t, byte[] bArr, zzgyr zzgyr) throws zzgzw {
        T zzi = zzi(t, bArr, 0, bArr.length, zzgyr);
        zzf(zzi);
        return zzi;
    }

    protected static <T extends zzgzh<T, ?>> T zzby(T t, zzgyf zzgyf) throws zzgzw {
        int i = zzgyr.zzb;
        int i2 = zzhbc.zza;
        return zzbz(t, zzgyf, zzgyr.zza);
    }

    static <T extends zzgzh<T, ?>> T zzbz(T t, zzgyf zzgyf, zzgyr zzgyr) throws zzgzw {
        T zzbj = t.zzbj();
        try {
            zzhbl zzb2 = zzhbc.zza().zzb(zzbj.getClass());
            zzb2.zzh(zzbj, zzgyg.zzq(zzgyf), zzgyr);
            zzb2.zzf(zzbj);
            return zzbj;
        } catch (zzgzw e) {
            if (e.zzb()) {
                throw new zzgzw((IOException) e);
            }
            throw e;
        } catch (zzhbw e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgzw) {
                throw ((zzgzw) e3.getCause());
            }
            throw new zzgzw(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzgzw) {
                throw ((zzgzw) e4.getCause());
            }
            throw e4;
        }
    }

    private int zzc(zzhbl<?> zzhbl) {
        if (zzhbl != null) {
            return zzhbl.zza(this);
        }
        return zzhbc.zza().zzb(getClass()).zza(this);
    }

    /* access modifiers changed from: private */
    public static <MessageType extends zzgzd<MessageType, BuilderType>, BuilderType, T> zzgzf<MessageType, T> zzd(zzgyp<MessageType, T> zzgyp) {
        return (zzgzf) zzgyp;
    }

    private static <T extends zzgzh<T, ?>> T zzf(T t) throws zzgzw {
        if (t == null || t.zzbw()) {
            return t;
        }
        throw t.zzaP().zza();
    }

    private static <T extends zzgzh<T, ?>> T zzg(T t, InputStream inputStream, zzgyr zzgyr) throws zzgzw {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            zzgyf zzG = zzgyf.zzG(new zzgxg(inputStream, zzgyf.zzE(read, inputStream)), ConstantsKt.DEFAULT_BLOCK_SIZE);
            T zzbz = zzbz(t, zzG, zzgyr);
            zzG.zzy(0);
            return zzbz;
        } catch (zzgzw e) {
            if (e.zzb()) {
                throw new zzgzw((IOException) e);
            }
            throw e;
        } catch (IOException e2) {
            throw new zzgzw(e2);
        }
    }

    private static <T extends zzgzh<T, ?>> T zzh(T t, zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        zzgyf zzl = zzgxz.zzl();
        T zzbz = zzbz(t, zzl, zzgyr);
        zzl.zzy(0);
        return zzbz;
    }

    /* access modifiers changed from: private */
    public static <T extends zzgzh<T, ?>> T zzi(T t, byte[] bArr, int i, int i2, zzgyr zzgyr) throws zzgzw {
        if (i2 == 0) {
            return t;
        }
        T zzbj = t.zzbj();
        try {
            zzhbl zzb2 = zzhbc.zza().zzb(zzbj.getClass());
            zzb2.zzi(zzbj, bArr, i, i + i2, new zzgxn(zzgyr));
            zzb2.zzf(zzbj);
            return zzbj;
        } catch (zzgzw e) {
            if (e.zzb()) {
                throw new zzgzw((IOException) e);
            }
            throw e;
        } catch (zzhbw e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgzw) {
                throw ((zzgzw) e3.getCause());
            }
            throw new zzgzw(e3);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private void zzj() {
        if (this.zzt == zzhby.zzc()) {
            this.zzt = zzhby.zzf();
        }
    }

    /* access modifiers changed from: private */
    public static final <T extends zzgzh<T, ?>> boolean zzk(T t, boolean z) {
        byte byteValue = ((Byte) t.zzdd(zzgzg.GET_MEMOIZED_IS_INITIALIZED, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzhbc.zza().zzb(t.getClass()).zzl(t);
        if (z) {
            t.zzdd(zzgzg.SET_MEMOIZED_IS_INITIALIZED, true != zzl ? null : t, (Object) null);
        }
        return zzl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzhbc.zza().zzb(getClass()).zzk(this, (zzgzh) obj);
    }

    public int hashCode() {
        if (zzcd()) {
            return zzaW();
        }
        if (zzcc()) {
            zzca(zzaW());
        }
        return zzaX();
    }

    public String toString() {
        return zzhau.zza(this, super.toString());
    }

    /* access modifiers changed from: package-private */
    public int zzaL() {
        return this.zzd & IntCompanionObject.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    public int zzaM(zzhbl zzhbl) {
        if (zzcd()) {
            int zzc2 = zzc(zzhbl);
            if (zzc2 >= 0) {
                return zzc2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zzc2);
        } else if (zzaL() != Integer.MAX_VALUE) {
            return zzaL();
        } else {
            int zzc3 = zzc(zzhbl);
            zzaS(zzc3);
            return zzc3;
        }
    }

    public zzhax zzaO() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    /* access modifiers changed from: package-private */
    public void zzaS(int i) {
        if (i >= 0) {
            this.zzd = i | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i);
    }

    /* access modifiers changed from: package-private */
    public int zzaW() {
        return zzhbc.zza().zzb(getClass()).zzb(this);
    }

    /* access modifiers changed from: package-private */
    public int zzaX() {
        return this.zzq;
    }

    public int zzaY() {
        return zzaM((zzhbl) null);
    }

    /* access modifiers changed from: protected */
    public final <MessageType2 extends zzgzh<MessageType2, BuilderType2>, BuilderType2 extends zzgzb<MessageType2, BuilderType2>> BuilderType2 zzaZ() {
        return (zzgzb) zzdd(zzgzg.NEW_BUILDER, (Object) null, (Object) null);
    }

    public final zzhba<MessageType> zzbN() {
        return (zzhba) zzdd(zzgzg.GET_PARSER, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public Object zzbO() throws Exception {
        return zzdd(zzgzg.BUILD_MESSAGE_INFO, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public void zzbS() {
        this.zzq = 0;
    }

    /* access modifiers changed from: package-private */
    public void zzbT() {
        zzaS(IntCompanionObject.MAX_VALUE);
    }

    /* access modifiers changed from: protected */
    public void zzbU() {
        zzhbc.zza().zzb(getClass()).zzf(this);
        zzbV();
    }

    /* access modifiers changed from: package-private */
    public void zzbV() {
        this.zzd &= IntCompanionObject.MAX_VALUE;
    }

    /* access modifiers changed from: protected */
    public void zzbW(int i, zzgxz zzgxz) {
        zzj();
        zzhby zzhby = this.zzt;
        zzhby.zzg();
        if (i != 0) {
            zzhby.zzj((i << 3) | 2, zzgxz);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* access modifiers changed from: protected */
    public final void zzbX(zzhby zzhby) {
        this.zzt = zzhby.zze(this.zzt, zzhby);
    }

    /* access modifiers changed from: protected */
    public void zzbY(int i, int i2) {
        zzj();
        zzhby zzhby = this.zzt;
        zzhby.zzg();
        if (i != 0) {
            zzhby.zzj(i << 3, Long.valueOf((long) i2));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* access modifiers changed from: protected */
    public final <MessageType2 extends zzgzh<MessageType2, BuilderType2>, BuilderType2 extends zzgzb<MessageType2, BuilderType2>> BuilderType2 zzba(MessageType2 messagetype2) {
        BuilderType2 zzaZ = zzaZ();
        zzaZ.zzbj(messagetype2);
        return zzaZ;
    }

    /* renamed from: zzbb */
    public final BuilderType zzcY() {
        return (zzgzb) zzdd(zzgzg.NEW_BUILDER, (Object) null, (Object) null);
    }

    /* renamed from: zzbc */
    public final BuilderType zzbM() {
        BuilderType buildertype = (zzgzb) zzdd(zzgzg.NEW_BUILDER, (Object) null, (Object) null);
        buildertype.zzbj(this);
        return buildertype;
    }

    /* renamed from: zzbi */
    public final MessageType zzbt() {
        return (zzgzh) zzdd(zzgzg.GET_DEFAULT_INSTANCE, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public MessageType zzbj() {
        return (zzgzh) zzdd(zzgzg.NEW_MUTABLE_INSTANCE, (Object) null, (Object) null);
    }

    public final boolean zzbw() {
        return zzk(this, true);
    }

    public void zzcZ(zzgym zzgym) throws IOException {
        zzhbc.zza().zzb(getClass()).zzj(this, zzgyn.zza(zzgym));
    }

    /* access modifiers changed from: package-private */
    public void zzca(int i) {
        this.zzq = i;
    }

    /* access modifiers changed from: package-private */
    public boolean zzcc() {
        return zzaX() == 0;
    }

    /* access modifiers changed from: package-private */
    public boolean zzcd() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* access modifiers changed from: protected */
    public boolean zzce(int i, zzgyf zzgyf) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        zzj();
        return this.zzt.zzm(i, zzgyf);
    }

    /* access modifiers changed from: protected */
    public abstract Object zzdd(zzgzg zzgzg, Object obj, Object obj2);
}
