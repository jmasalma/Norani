package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgxh;
import com.google.android.gms.internal.ads.zzgxi;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public abstract class zzgxi<MessageType extends zzgxi<MessageType, BuilderType>, BuilderType extends zzgxh<MessageType, BuilderType>> implements zzhas {
    protected int zzq = 0;

    protected static <T> void zzaQ(Iterable<T> iterable, List<? super T> list) {
        zzgxh.zzbd(iterable, list);
    }

    protected static void zzaR(zzgxz zzgxz) throws IllegalArgumentException {
        if (!zzgxz.zzp()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String zzdI(String str) {
        String name = getClass().getName();
        return "Serializing " + name + " to a " + str + " threw an IOException (should never happen).";
    }

    /* access modifiers changed from: package-private */
    public int zzaL() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int zzaM(zzhbl zzhbl) {
        return zzaL();
    }

    public zzgxz zzaN() {
        try {
            int zzaY = zzaY();
            zzgxz zzgxz = zzgxz.zzb;
            byte[] bArr = new byte[zzaY];
            int i = zzgym.zzf;
            zzgyi zzgyi = new zzgyi(bArr, 0, zzaY);
            zzcZ(zzgyi);
            zzgyi.zzF();
            return new zzgxw(bArr);
        } catch (IOException e) {
            throw new RuntimeException(zzdI("ByteString"), e);
        }
    }

    public zzhax zzaO() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    /* access modifiers changed from: package-private */
    public zzhbw zzaP() {
        return new zzhbw(this);
    }

    /* access modifiers changed from: package-private */
    public void zzaS(int i) {
        throw new UnsupportedOperationException();
    }

    public void zzaT(OutputStream outputStream) throws IOException {
        int zzaY = zzaY();
        zzgyk zzgyk = new zzgyk(outputStream, zzgym.zzB(zzgym.zzD(zzaY) + zzaY));
        zzgyk.zzu(zzaY);
        zzcZ(zzgyk);
        zzgyk.zzK();
    }

    public void zzaU(OutputStream outputStream) throws IOException {
        zzgyk zzgyk = new zzgyk(outputStream, zzgym.zzB(zzaY()));
        zzcZ(zzgyk);
        zzgyk.zzK();
    }

    public byte[] zzaV() {
        try {
            int zzaY = zzaY();
            byte[] bArr = new byte[zzaY];
            int i = zzgym.zzf;
            zzgyi zzgyi = new zzgyi(bArr, 0, zzaY);
            zzcZ(zzgyi);
            zzgyi.zzF();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(zzdI("byte array"), e);
        }
    }
}
