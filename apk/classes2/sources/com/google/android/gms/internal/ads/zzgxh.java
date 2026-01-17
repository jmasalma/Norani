package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgxh;
import com.google.android.gms.internal.ads.zzgxi;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import kotlin.io.ConstantsKt;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public abstract class zzgxh<MessageType extends zzgxi<MessageType, BuilderType>, BuilderType extends zzgxh<MessageType, BuilderType>> implements zzhar {
    private String zza(String str) {
        String name = getClass().getName();
        return "Reading " + name + " from a " + str + " threw an IOException (should never happen).";
    }

    private static <T> void zzb(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzhbd) {
                ((zzhbd) list).zze(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (T next : iterable) {
                if (next == null) {
                    zzc(list, size2);
                }
                list.add(next);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i = 0; i < size3; i++) {
            Object obj = list2.get(i);
            if (obj == null) {
                zzc(list, size2);
            }
            list.add(obj);
        }
    }

    protected static zzhbw zzbb(zzhas zzhas) {
        return new zzhbw(zzhas);
    }

    @Deprecated
    protected static <T> void zzbc(Iterable<T> iterable, Collection<? super T> collection) {
        zzbd(iterable, (List) collection);
    }

    protected static <T> void zzbd(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzgzu.zzb;
        iterable.getClass();
        if (iterable instanceof zzhae) {
            List zza = ((zzhae) iterable).zza();
            zzhae zzhae = (zzhae) list;
            int size = list.size();
            for (Object next : zza) {
                if (next == null) {
                    String str = "Element at index " + (zzhae.size() - size) + " is null.";
                    int size2 = zzhae.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            zzhae.remove(size2);
                        } else {
                            throw new NullPointerException(str);
                        }
                    }
                } else if (next instanceof zzgxz) {
                    zzgxz zzgxz = (zzgxz) next;
                    zzhae.zzb();
                } else if (next instanceof byte[]) {
                    byte[] bArr2 = (byte[]) next;
                    zzgxz.zzv(bArr2, 0, bArr2.length);
                    zzhae.zzb();
                } else {
                    zzhae.add((String) next);
                }
            }
        } else if (iterable instanceof zzhbb) {
            list.addAll((Collection) iterable);
        } else {
            zzb(iterable, list);
        }
    }

    private static void zzc(List<?> list, int i) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size >= i) {
                list.remove(size);
            } else {
                throw new NullPointerException(str);
            }
        }
    }

    /* renamed from: zzaC */
    public abstract BuilderType zzaP();

    /* access modifiers changed from: protected */
    public abstract BuilderType zzaD(MessageType messagetype);

    public BuilderType zzaE(zzgxz zzgxz) throws zzgzw {
        try {
            zzgyf zzl = zzgxz.zzl();
            zzaR(zzl);
            zzl.zzy(0);
            return this;
        } catch (zzgzw e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    /* renamed from: zzaF */
    public BuilderType zzaR(zzgyf zzgyf) throws IOException {
        int i = zzgyr.zzb;
        int i2 = zzhbc.zza;
        return zzaW(zzgyf, zzgyr.zza);
    }

    /* renamed from: zzaG */
    public BuilderType zzaS(zzhas zzhas) {
        if (zzbt().getClass().isInstance(zzhas)) {
            return zzaD((zzgxi) zzhas);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public BuilderType zzaH(InputStream inputStream) throws IOException {
        zzgyf zzG = zzgyf.zzG(inputStream, ConstantsKt.DEFAULT_BLOCK_SIZE);
        zzaR(zzG);
        zzG.zzy(0);
        return this;
    }

    /* renamed from: zzaI */
    public BuilderType zzaU(byte[] bArr) throws zzgzw {
        return zzaZ(bArr, 0, bArr.length);
    }

    public BuilderType zzaJ(zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        try {
            zzgyf zzl = zzgxz.zzl();
            zzaW(zzl, zzgyr);
            zzl.zzy(0);
            return this;
        } catch (zzgzw e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("ByteString"), e2);
        }
    }

    /* renamed from: zzaK */
    public abstract BuilderType zzaW(zzgyf zzgyf, zzgyr zzgyr) throws IOException;

    public BuilderType zzaL(InputStream inputStream, zzgyr zzgyr) throws IOException {
        zzgyf zzG = zzgyf.zzG(inputStream, ConstantsKt.DEFAULT_BLOCK_SIZE);
        zzaW(zzG, zzgyr);
        zzG.zzy(0);
        return this;
    }

    /* renamed from: zzaM */
    public BuilderType zzaY(byte[] bArr, zzgyr zzgyr) throws zzgzw {
        return zzba(bArr, 0, bArr.length, zzgyr);
    }

    /* renamed from: zzaN */
    public BuilderType zzaZ(byte[] bArr, int i, int i2) throws zzgzw {
        try {
            zzgyf zzH = zzgyf.zzH(bArr, i, i2, false);
            zzaR(zzH);
            zzH.zzy(0);
            return this;
        } catch (zzgzw e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    /* renamed from: zzaO */
    public BuilderType zzba(byte[] bArr, int i, int i2, zzgyr zzgyr) throws zzgzw {
        try {
            zzgyf zzH = zzgyf.zzH(bArr, i, i2, false);
            zzaW(zzH, zzgyr);
            zzH.zzy(0);
            return this;
        } catch (zzgzw e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(zza("byte array"), e2);
        }
    }

    public /* bridge */ /* synthetic */ zzhar zzaQ(zzgxz zzgxz) throws zzgzw {
        zzaE(zzgxz);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhar zzaT(InputStream inputStream) throws IOException {
        zzaH(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhar zzaV(zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        zzaJ(zzgxz, zzgyr);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhar zzaX(InputStream inputStream, zzgyr zzgyr) throws IOException {
        zzaL(inputStream, zzgyr);
        return this;
    }

    public boolean zzbe(InputStream inputStream) throws IOException {
        int i = zzgyr.zzb;
        int i2 = zzhbc.zza;
        return zzbf(inputStream, zzgyr.zza);
    }

    public boolean zzbf(InputStream inputStream, zzgyr zzgyr) throws IOException {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        zzaL(new zzgxg(inputStream, zzgyf.zzE(read, inputStream)), zzgyr);
        return true;
    }
}
