package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbef;
import com.google.android.gms.internal.ads.zzhhh;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzo implements zzbee {
    final /* synthetic */ zzbef zza;
    final /* synthetic */ Context zzb;
    final /* synthetic */ Uri zzc;

    zzo(zzs zzs, zzbef zzbef, Context context, Uri uri) {
        this.zza = zzbef;
        this.zzb = context;
        this.zzc = uri;
        Objects.requireNonNull(zzs);
    }

    public final void zza() {
        zzbef zzbef = this.zza;
        CustomTabsIntent build = new CustomTabsIntent.Builder(zzbef.zza()).build();
        Intent intent = build.intent;
        Context context = this.zzb;
        intent.setPackage(zzhhh.zza(context));
        build.launchUrl(context, this.zzc);
        zzbef.zzf((Activity) context);
    }
}
