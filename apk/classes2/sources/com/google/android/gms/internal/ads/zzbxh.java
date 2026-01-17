package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbxh {
    public static final zzbwv zza(Context context, String str, zzbpq zzbpq) {
        try {
            IBinder zze = ((zzbwz) zzs.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new zzbxg())).zze(ObjectWrapper.wrap(context), str, zzbpq, 252530000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof zzbwv ? (zzbwv) queryLocalInterface : new zzbwt(zze);
        } catch (RemoteException | zzr e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
