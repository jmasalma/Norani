package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzb;
import com.google.android.gms.internal.ads.zzgzh;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public class zzgzb<MessageType extends zzgzh<MessageType, BuilderType>, BuilderType extends zzgzb<MessageType, BuilderType>> extends zzgxh<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    protected zzgzb(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzcd()) {
            this.zza = zza();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private MessageType zza() {
        return this.zzb.zzbj();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        zzhbc.zza().zzb(messagetype.getClass()).zzg(messagetype, messagetype2);
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ zzgxh zzaD(zzgxi zzgxi) {
        zzbi((zzgzh) zzgxi);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgxh zzaK(zzgyf zzgyf, zzgyr zzgyr) throws IOException {
        zzbk(zzgyf, zzgyr);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgxh zzaN(byte[] bArr, int i, int i2) throws zzgzw {
        zzbl(bArr, i, i2);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgxh zzaO(byte[] bArr, int i, int i2, zzgyr zzgyr) throws zzgzw {
        zzbm(bArr, i, i2, zzgyr);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhar zzaW(zzgyf zzgyf, zzgyr zzgyr) throws IOException {
        zzbk(zzgyf, zzgyr);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhar zzaZ(byte[] bArr, int i, int i2) throws zzgzw {
        zzbl(bArr, i, i2);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhar zzba(byte[] bArr, int i, int i2, zzgyr zzgyr) throws zzgzw {
        zzbm(bArr, i, i2, zzgyr);
        return this;
    }

    public final BuilderType zzbg() {
        if (!this.zzb.zzcd()) {
            this.zza = zza();
            return this;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: zzbh */
    public BuilderType zzaP() {
        BuilderType zzbb = zzbt().zzcY();
        zzbb.zza = zzbs();
        return zzbb;
    }

    /* access modifiers changed from: protected */
    public BuilderType zzbi(MessageType messagetype) {
        zzbj(messagetype);
        return this;
    }

    public BuilderType zzbj(MessageType messagetype) {
        if (zzbt().equals(messagetype)) {
            return this;
        }
        zzbu();
        zzb(this.zza, messagetype);
        return this;
    }

    public BuilderType zzbk(zzgyf zzgyf, zzgyr zzgyr) throws IOException {
        zzbu();
        try {
            zzhbc.zza().zzb(this.zza.getClass()).zzh(this.zza, zzgyg.zzq(zzgyf), zzgyr);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    public BuilderType zzbl(byte[] bArr, int i, int i2) throws zzgzw {
        int i3 = zzgyr.zzb;
        int i4 = zzhbc.zza;
        zzbm(bArr, i, i2, zzgyr.zza);
        return this;
    }

    public BuilderType zzbm(byte[] bArr, int i, int i2, zzgyr zzgyr) throws zzgzw {
        zzbu();
        try {
            zzhbc.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, i, i + i2, new zzgxn(zzgyr));
            return this;
        } catch (zzgzw e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgzw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    /* renamed from: zzbn */
    public final MessageType zzbr() {
        MessageType zzbo = zzbs();
        if (zzbo.zzbw()) {
            return zzbo;
        }
        throw zzbb(zzbo);
    }

    /* renamed from: zzbo */
    public MessageType zzbs() {
        if (!this.zza.zzcd()) {
            return this.zza;
        }
        this.zza.zzbU();
        return this.zza;
    }

    /* renamed from: zzbp */
    public MessageType zzbt() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzhar zzbq() {
        zzbg();
        return this;
    }

    /* access modifiers changed from: protected */
    public final void zzbu() {
        if (!this.zza.zzcd()) {
            zzbv();
        }
    }

    /* access modifiers changed from: protected */
    public void zzbv() {
        MessageType zza2 = zza();
        zzb(zza2, this.zza);
        this.zza = zza2;
    }

    public final boolean zzbw() {
        return zzgzh.zzk(this.zza, false);
    }
}
