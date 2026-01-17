package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcj;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbcc {
    private final zzbci zza;
    private final zzbcj.zzt.zza zzb;
    private final boolean zzc;

    private zzbcc() {
        this.zzb = zzbcj.zzt.zzj();
        this.zzc = false;
        this.zza = new zzbci();
    }

    public static zzbcc zza() {
        return new zzbcc();
    }

    private final synchronized String zzd(int i) {
        zzbcj.zzt.zza zza2;
        zza2 = this.zzb;
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[]{zza2.zzah(), Long.valueOf(zzv.zzD().elapsedRealtime()), Integer.valueOf(i - 1), Base64.encodeToString(((zzbcj.zzt) zza2.zzbr()).zzaV(), 3)});
    }

    private final synchronized void zze(int i) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(zzfqt.zza(zzfqs.zza(), externalStorageDirectory, "clearcut_events.txt")), true);
                try {
                    fileOutputStream.write(zzd(i).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                zze.zza("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    zze.zza("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    private final synchronized void zzf(int i) {
        zzbcj.zzt.zza zza2 = this.zzb;
        zza2.zzq();
        zza2.zzj(zzs.zzd());
        zzbcg zzbcg = new zzbcg(this.zza, ((zzbcj.zzt) zza2.zzbr()).zzaV(), (zzbch) null);
        int i2 = i - 1;
        zzbcg.zza(i2);
        zzbcg.zzc();
        zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    public final synchronized void zzb(zzbcb zzbcb) {
        if (this.zzc) {
            try {
                zzbcb.zza(this.zzb);
            } catch (NullPointerException e) {
                zzv.zzp().zzw(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i) {
        if (this.zzc) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzfu)).booleanValue()) {
                zze(i);
            } else {
                zzf(i);
            }
        }
    }

    public zzbcc(zzbci zzbci) {
        this.zzb = zzbcj.zzt.zzj();
        this.zza = zzbci;
        this.zzc = ((Boolean) zzbd.zzc().zzb(zzbde.zzft)).booleanValue();
    }
}
