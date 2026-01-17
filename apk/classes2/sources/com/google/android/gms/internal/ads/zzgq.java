package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgq implements zzgj {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzgj zzc;
    private zzgj zzd;
    private zzgj zze;
    private zzgj zzf;
    private zzgj zzg;
    private zzgj zzh;
    private zzgj zzi;
    private zzgj zzj;
    private zzgj zzk;

    public zzgq(Context context, zzgj zzgj) {
        this.zza = context.getApplicationContext();
        zzgj zzgj2 = zzgj;
        this.zzc = zzgj;
    }

    private final zzgj zzg() {
        if (this.zze == null) {
            zzgb zzgb = new zzgb(this.zza);
            this.zze = zzgb;
            zzh(zzgb);
        }
        return this.zze;
    }

    private final void zzh(zzgj zzgj) {
        int i = 0;
        while (true) {
            List list = this.zzb;
            if (i < list.size()) {
                zzgj.zzf((zzhj) list.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    private static final void zzi(zzgj zzgj, zzhj zzhj) {
        if (zzgj != null) {
            zzgj.zzf(zzhj);
        }
    }

    public final long zzb(zzgo zzgo) throws IOException {
        zzgj zzgj;
        zzdd.zzf(this.zzk == null);
        Uri uri = zzgo.zza;
        String scheme = uri.getScheme();
        String str = zzex.zza;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzgy zzgy = new zzgy();
                    this.zzd = zzgy;
                    zzh(zzgy);
                }
                this.zzk = this.zzd;
            } else {
                this.zzk = zzg();
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzg();
        } else if ("content".equals(scheme)) {
            if (this.zzf == null) {
                zzgg zzgg = new zzgg(this.zza);
                this.zzf = zzgg;
                zzh(zzgg);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzgj zzgj2 = (zzgj) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.zzg = zzgj2;
                    zzh(zzgj2);
                } catch (ClassNotFoundException unused) {
                    zzea.zzf("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                zzhl zzhl = new zzhl(2000);
                this.zzh = zzhl;
                zzh(zzhl);
            }
            this.zzk = this.zzh;
        } else if ("data".equals(scheme)) {
            if (this.zzi == null) {
                zzgh zzgh = new zzgh();
                this.zzi = zzgh;
                zzh(zzgh);
            }
            this.zzk = this.zzi;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    zzhh zzhh = new zzhh(this.zza);
                    this.zzj = zzhh;
                    zzh(zzhh);
                }
                zzgj = this.zzj;
            } else {
                zzgj = this.zzc;
            }
            this.zzk = zzgj;
        }
        return this.zzk.zzb(zzgo);
    }

    public final Uri zzc() {
        zzgj zzgj = this.zzk;
        if (zzgj == null) {
            return null;
        }
        return zzgj.zzc();
    }

    public final void zzd() throws IOException {
        zzgj zzgj = this.zzk;
        if (zzgj != null) {
            try {
                zzgj.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    public final Map zze() {
        zzgj zzgj = this.zzk;
        return zzgj == null ? Collections.emptyMap() : zzgj.zze();
    }

    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        zzgj zzgj = this.zzk;
        zzgj.getClass();
        zzgj zzgj2 = zzgj;
        return zzgj.zza(bArr, i, i2);
    }

    public final void zzf(zzhj zzhj) {
        zzhj.getClass();
        this.zzc.zzf(zzhj);
        this.zzb.add(zzhj);
        zzi(this.zzd, zzhj);
        zzi(this.zze, zzhj);
        zzi(this.zzf, zzhj);
        zzi(this.zzg, zzhj);
        zzi(this.zzh, zzhj);
        zzi(this.zzi, zzhj);
        zzi(this.zzj, zzhj);
    }
}
