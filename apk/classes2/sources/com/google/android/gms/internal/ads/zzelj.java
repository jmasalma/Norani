package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzelj {
    private final zzelo zza;
    private final String zzb;
    /* access modifiers changed from: private */
    public zzea zzc;

    public zzelj(zzelo zzelo, String str) {
        this.zza = zzelo;
        this.zzb = str;
    }

    public final synchronized String zza() {
        String str;
        str = null;
        try {
            zzea zzea = this.zzc;
            if (zzea != null) {
                str = zzea.zzg();
            }
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    public final synchronized String zzb() {
        String str;
        str = null;
        try {
            zzea zzea = this.zzc;
            if (zzea != null) {
                str = zzea.zzg();
            }
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    public final synchronized void zzd(zzm zzm, int i) throws RemoteException {
        this.zzc = null;
        zzelp zzelp = new zzelp(i);
        zzeli zzeli = new zzeli(this);
        this.zza.zzb(zzm, this.zzb, zzelp, zzeli);
    }

    public final synchronized boolean zze() throws RemoteException {
        return this.zza.zza();
    }
}
