package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzfv;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzflh extends zzfld {
    public zzflh(ClientApi clientApi, Context context, int i, zzbpq zzbpq, zzfv zzfv, zzce zzce, ScheduledExecutorService scheduledExecutorService, zzfkg zzfkg, Clock clock) {
        super(clientApi, context, i, zzbpq, zzfv, zzce, scheduledExecutorService, zzfkg, clock);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ zzea zza(Object obj) {
        try {
            return ((zzbwv) obj).zzd();
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzf("Failed to get response info for the rewarded ad.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final ListenableFuture zzb(Context context) {
        zzgeh zze = zzgeh.zze();
        zzbwv zzp = this.zza.zzp(ObjectWrapper.wrap(context), this.zze.zza, this.zzd, this.zzc);
        zzflg zzflg = new zzflg(this, zze, zzp);
        if (zzp != null) {
            try {
                zzp.zzh(this.zze.zzc, zzflg);
            } catch (RemoteException unused) {
                zzo.zzj("Failed to load rewarded ad.");
                zze.zzd(new zzfka(1, "remote exception"));
            }
        } else {
            zze.zzd(new zzfka(1, "Failed to create a rewarded ad."));
        }
        return zze;
    }

    public zzflh(String str, ClientApi clientApi, Context context, int i, zzbpq zzbpq, zzfv zzfv, zzch zzch, ScheduledExecutorService scheduledExecutorService, zzfkg zzfkg, Clock clock) {
        super(str, clientApi, context, i, zzbpq, zzfv, zzch, scheduledExecutorService, zzfkg, clock);
    }
}
