package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzeue implements Callable {
    public final /* synthetic */ List zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ Bundle zzd;
    public final /* synthetic */ Bundle zze;

    public /* synthetic */ zzeue(List list, Object obj, boolean z, Bundle bundle, Bundle bundle2) {
        this.zza = list;
        this.zzb = obj;
        this.zzc = z;
        this.zzd = bundle;
        this.zze = bundle2;
    }

    public final Object call() {
        Object obj;
        Bundle bundle;
        Iterator it = this.zza.iterator();
        while (true) {
            obj = this.zzb;
            if (!it.hasNext()) {
                break;
            }
            zzeub zzeub = (zzeub) ((ListenableFuture) it.next()).get();
            if (zzeub != null) {
                boolean z = this.zzc;
                zzeub.zzb(obj);
                if (z) {
                    zzeub.zza(obj);
                }
            }
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcq)).booleanValue() && (bundle = this.zzd) != null) {
            Bundle bundle2 = this.zze;
            long currentTimeMillis = zzv.zzD().currentTimeMillis();
            if (obj instanceof zzcva) {
                bundle.putLong(zzdrr.CLIENT_SIGNALS_END.zza(), currentTimeMillis);
                bundle.putBundle("client_sig_latency_key", bundle2);
            } else {
                bundle.putLong(zzdrr.GMS_SIGNALS_END.zza(), currentTimeMillis);
                bundle.putBundle("gms_sig_latency_key", bundle2);
            }
        }
        return obj;
    }
}
