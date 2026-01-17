package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeit implements zzedm {
    private final zzedo zza;
    private final zzeds zzb;
    private final zzfha zzc;
    private final zzgdy zzd;

    public zzeit(zzfha zzfha, zzgdy zzgdy, zzedo zzedo, zzeds zzeds) {
        this.zzc = zzfha;
        this.zzd = zzgdy;
        this.zzb = zzeds;
        this.zza = zzedo;
    }

    static final String zze(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    public final ListenableFuture zza(zzfcn zzfcn, zzfca zzfca) {
        zzedp zzedp;
        Iterator it = zzfca.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzedp = null;
                break;
            }
            try {
                zzedp = this.zza.zza((String) it.next(), zzfca.zzv);
                break;
            } catch (zzfdd unused) {
            }
        }
        if (zzedp == null) {
            return zzgdn.zzg(new zzegj("Unable to instantiate mediation adapter class."));
        }
        zzcak zzcak = new zzcak();
        zzedp.zzc.zza(new zzeis(this, zzedp, zzcak));
        if (zzfca.zzM) {
            Bundle bundle = zzfcn.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfha zzfha = this.zzc;
        zzfgu zzfgu = zzfgu.ADAPTER_LOAD_AD_SYN;
        Objects.requireNonNull(zzfha);
        return zzfgk.zzd(new zzeiq(this, zzfcn, zzfca, zzedp), this.zzd, zzfgu, zzfha).zzb(zzfgu.ADAPTER_LOAD_AD_ACK).zzd(zzcak).zzb(zzfgu.ADAPTER_WRAP_ADAPTER).zze(new zzeir(this, zzfcn, zzfca, zzedp)).zza();
    }

    public final boolean zzb(zzfcn zzfcn, zzfca zzfca) {
        return !zzfca.zzt.isEmpty();
    }
}
