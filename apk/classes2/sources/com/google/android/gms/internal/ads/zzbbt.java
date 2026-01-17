package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzbbt implements Runnable {
    public final /* synthetic */ zzbbw zza;
    public final /* synthetic */ zzbbn zzb;
    public final /* synthetic */ zzbbo zzc;
    public final /* synthetic */ zzcak zzd;

    public /* synthetic */ zzbbt(zzbbw zzbbw, zzbbn zzbbn, zzbbo zzbbo, zzcak zzcak) {
        this.zza = zzbbw;
        this.zzb = zzbbn;
        this.zzc = zzbbo;
        this.zzd = zzcak;
    }

    public final void run() {
        zzbbl zzbbl;
        zzbbw zzbbw = this.zza;
        zzbbn zzbbn = this.zzb;
        zzcak zzcak = this.zzd;
        try {
            zzbbq zzq = zzbbn.zzq();
            boolean zzp = zzbbn.zzp();
            zzbbo zzbbo = this.zzc;
            if (zzp) {
                zzbbl = zzq.zzg(zzbbo);
            } else {
                zzbbl = zzq.zzf(zzbbo);
            }
            if (!zzbbl.zze()) {
                zzcak.zzd(new RuntimeException("No entry contents."));
                zzbby.zze(zzbbw.zzc);
                return;
            }
            zzbbv zzbbv = new zzbbv(zzbbw, zzbbl.zzc(), 1);
            int read = zzbbv.read();
            if (read != -1) {
                zzbbv.unread(read);
                zzcak.zzc(zzbca.zzb(zzbbv, zzbbl.zzd(), zzbbl.zzg(), zzbbl.zza(), zzbbl.zzf()));
                return;
            }
            throw new IOException("Unable to read from cache.");
        } catch (RemoteException | IOException e) {
            int i = zze.zza;
            zzo.zzh("Unable to obtain a cache service instance.", e);
            zzcak.zzd(e);
            zzbby.zze(zzbbw.zzc);
        }
    }
}
