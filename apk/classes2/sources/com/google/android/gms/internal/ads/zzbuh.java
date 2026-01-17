package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzek;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbuh {
    private static zzbza zza;
    private final Context zzb;
    private final AdFormat zzc;
    private final zzek zzd;
    private final String zze;

    public zzbuh(Context context, AdFormat adFormat, zzek zzek, String str) {
        this.zzb = context;
        this.zzc = adFormat;
        this.zzd = zzek;
        this.zze = str;
    }

    public static zzbza zza(Context context) {
        zzbza zzbza;
        synchronized (zzbuh.class) {
            if (zza == null) {
                zza = zzbb.zza().zzt(context, new zzbpm());
            }
            zzbza = zza;
        }
        return zzbza;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzm zzm;
        long currentTimeMillis = System.currentTimeMillis();
        Context context = this.zzb;
        zzbza zza2 = zza(context);
        if (zza2 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzek zzek = this.zzd;
        if (zzek == null) {
            zzn zzn = new zzn();
            zzn.zzg(currentTimeMillis);
            zzm = zzn.zza();
        } else {
            zzek.zzp(currentTimeMillis);
            zzm = zzq.zza.zza(context, zzek);
        }
        try {
            zza2.zzf(wrap, new zzbze(this.zze, this.zzc.name(), (zzr) null, zzm, 0, (String) null), new zzbug(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
