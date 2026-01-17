package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final /* synthetic */ class zzbcz implements zzfwh {
    public final /* synthetic */ SharedPreferences zza;

    public /* synthetic */ zzbcz(SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
    }

    public final Object zza() {
        return this.zza.getString("flag_configuration", "{}");
    }
}
