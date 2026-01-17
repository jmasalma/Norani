package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbe;
import com.google.android.gms.ads.internal.util.zzbf;
import com.google.android.gms.ads.internal.util.zzbh;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzccc {
    private static final boolean zza = (zzbb.zze().nextInt(100) < ((Integer) zzbd.zzc().zzb(zzbde.zznd)).intValue());
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    private final zzbdq zze;
    private final zzbdt zzf;
    private final zzbh zzg;
    private final long[] zzh;
    private final String[] zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = false;
    private boolean zzm = false;
    private boolean zzn;
    private zzcbh zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr = -1;

    public zzccc(Context context, VersionInfoParcel versionInfoParcel, String str, zzbdt zzbdt, zzbdq zzbdq) {
        zzbf zzbf = new zzbf();
        zzbf zzbf2 = zzbf;
        zzbf2.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbf2.zza("1_5", 1.0d, 5.0d);
        zzbf2.zza("5_10", 5.0d, 10.0d);
        zzbf2.zza("10_20", 10.0d, 20.0d);
        zzbf2.zza("20_30", 20.0d, 30.0d);
        zzbf2.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.zzg = zzbf.zzb();
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zzc = str;
        this.zzf = zzbdt;
        this.zze = zzbdq;
        String str2 = (String) zzbd.zzc().zzb(zzbde.zzS);
        if (str2 == null) {
            this.zzi = new String[0];
            this.zzh = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.zzi = new String[length];
        this.zzh = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.zzh[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e) {
                int i2 = zze.zza;
                zzo.zzk("Unable to parse frame hash target time number.", e);
                this.zzh[i] = -1;
            }
        }
    }

    public final void zza(zzcbh zzcbh) {
        zzbdt zzbdt = this.zzf;
        zzbdl.zza(zzbdt, this.zze, "vpc2");
        this.zzj = true;
        zzbdt.zzd("vpn", zzcbh.zzj());
        this.zzo = zzcbh;
    }

    public final void zzb() {
        if (this.zzj && !this.zzk) {
            zzbdl.zza(this.zzf, this.zze, "vfr2");
            this.zzk = true;
        }
    }

    public final void zzc() {
        this.zzn = true;
        if (this.zzk && !this.zzl) {
            zzbdl.zza(this.zzf, this.zze, "vfp2");
            this.zzl = true;
        }
    }

    public final void zzd() {
        if (zza && !this.zzp) {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.zzc);
            bundle.putString("player", this.zzo.zzj());
            for (zzbe zzbe : this.zzg.zza()) {
                String str = zzbe.zza;
                String valueOf = String.valueOf(str);
                bundle.putString("fps_c_".concat(valueOf), Integer.toString(zzbe.zze));
                String valueOf2 = String.valueOf(str);
                bundle.putString("fps_p_".concat(valueOf2), Double.toString(zzbe.zzd));
            }
            int i = 0;
            while (true) {
                long[] jArr = this.zzh;
                if (i < jArr.length) {
                    String str2 = this.zzi[i];
                    if (str2 != null) {
                        Long valueOf3 = Long.valueOf(jArr[i]);
                        new StringBuilder("fh_").append(valueOf3);
                        bundle.putString("fh_".concat(valueOf3.toString()), str2);
                    }
                    i++;
                } else {
                    zzv.zzr().zzi(this.zzb, this.zzd.afmaVersion, "gmob-apps", bundle, true);
                    this.zzp = true;
                    return;
                }
            }
        }
    }

    public final void zze() {
        this.zzn = false;
    }

    public final void zzf(zzcbh zzcbh) {
        int i = 0;
        if (this.zzl && !this.zzm) {
            if (zze.zzc() && !this.zzm) {
                zze.zza("VideoMetricsMixin first frame");
            }
            zzbdl.zza(this.zzf, this.zze, "vff2");
            this.zzm = true;
        }
        long nanoTime = zzv.zzD().nanoTime();
        if (this.zzn && this.zzq && this.zzr != -1) {
            this.zzg.zzb(((double) TimeUnit.SECONDS.toNanos(1)) / ((double) (nanoTime - this.zzr)));
        }
        this.zzq = this.zzn;
        this.zzr = nanoTime;
        long longValue = ((Long) zzbd.zzc().zzb(zzbde.zzT)).longValue();
        long zza2 = (long) zzcbh.zza();
        int i2 = 0;
        while (true) {
            String[] strArr = this.zzi;
            if (i2 >= strArr.length) {
                return;
            }
            if (strArr[i2] == null && longValue > Math.abs(zza2 - this.zzh[i2])) {
                int i3 = 8;
                Bitmap bitmap = zzcbh.getBitmap(8, 8);
                long j = 63;
                int i4 = i;
                long j2 = 0;
                while (i4 < i3) {
                    while (i < i3) {
                        int pixel = bitmap.getPixel(i, i4);
                        j2 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j);
                        j--;
                        i++;
                        i3 = 8;
                    }
                    i4++;
                    i = 0;
                    i3 = 8;
                }
                strArr[i2] = String.format("%016X", new Object[]{Long.valueOf(j2)});
                return;
            }
            zzcbh zzcbh2 = zzcbh;
            i2++;
            i = 0;
        }
    }
}
