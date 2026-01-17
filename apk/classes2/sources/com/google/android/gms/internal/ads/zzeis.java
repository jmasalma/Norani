package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzeis implements zzcxh {
    boolean zza = false;
    final /* synthetic */ zzedp zzb;
    final /* synthetic */ zzcak zzc;

    zzeis(zzeit zzeit, zzedp zzedp, zzcak zzcak) {
        this.zzb = zzedp;
        this.zzc = zzcak;
        Objects.requireNonNull(zzeit);
    }

    private final synchronized void zze(zze zze) {
        int i = 1;
        if (true == ((Boolean) zzbd.zzc().zzb(zzbde.zzfO)).booleanValue()) {
            i = 3;
        }
        this.zzc.zzd(new zzedq(i, zze));
    }

    public final synchronized void zza(int i) {
        if (!this.zza) {
            this.zza = true;
            zze(new zze(i, zzeit.zze(this.zzb.zza, i), "undefined", (zze) null, (IBinder) null));
        }
    }

    public final synchronized void zzb(zze zze) {
        if (!this.zza) {
            this.zza = true;
            zze(zze);
        }
    }

    public final synchronized void zzc(int i, String str) {
        if (!this.zza) {
            this.zza = true;
            if (str == null) {
                str = zzeit.zze(this.zzb.zza, i);
            }
            zze(new zze(i, str, "undefined", (zze) null, (IBinder) null));
        }
    }

    public final synchronized void zzd() {
        this.zzc.zzc((Object) null);
    }
}
