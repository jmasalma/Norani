package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzchr implements zzhgr {
    private zzchr(zzchh zzchh) {
    }

    public static zzchr zza(zzchh zzchh) {
        return new zzchr(zzchh);
    }

    public final /* synthetic */ Object zzb() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse("https://play.google.com/d"));
        Intent intent2 = intent;
        return intent;
    }
}
