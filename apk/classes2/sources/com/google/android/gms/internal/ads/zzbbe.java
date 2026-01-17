package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzaz;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzek;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbbe {
    private zzbx zza;
    private final Context zzb;
    private final String zzc;
    private final zzek zzd;
    private final AppOpenAd.AppOpenAdLoadCallback zze;
    private final zzbpm zzf = new zzbpm();
    private final zzq zzg;

    public zzbbe(Context context, String str, zzek zzek, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = zzek;
        this.zze = appOpenAdLoadCallback;
        this.zzg = zzq.zza;
    }

    public final void zza() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            zzr zzb2 = zzr.zzb();
            zzaz zza2 = zzbb.zza();
            Context context = this.zzb;
            String str = this.zzc;
            zzbx zze2 = zza2.zze(context, zzb2, str, this.zzf);
            this.zza = zze2;
            if (zze2 != null) {
                zzek zzek = this.zzd;
                zzek.zzp(currentTimeMillis);
                this.zza.zzI(new zzbar(this.zze, str));
                this.zza.zzad(this.zzg.zza(context, zzek));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
