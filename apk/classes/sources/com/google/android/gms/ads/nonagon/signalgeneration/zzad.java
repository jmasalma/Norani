package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzgct;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzad implements zzgct {
    public final /* synthetic */ zzau zza;

    public /* synthetic */ zzad(zzau zzau) {
        this.zza = zzau;
    }

    public final ListenableFuture zza() {
        return this.zza.zzR(this.zza.zzg, (String) null, AdFormat.BANNER.name(), (zzr) null, (zzm) null, 0, (String) null, new Bundle(), (zzbze) null).zzb();
    }
}
