package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzbim;
import com.google.android.gms.internal.ads.zzblh;
import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzbtj;
import com.google.android.gms.internal.ads.zzbtn;
import com.google.android.gms.internal.ads.zzbtq;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzbwv;
import com.google.android.gms.internal.ads.zzbxh;
import com.google.android.gms.internal.ads.zzbza;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzaz {
    /* access modifiers changed from: private */
    public final zzk zza;
    /* access modifiers changed from: private */
    public final zzi zzb;
    /* access modifiers changed from: private */
    public final zzfg zzc;
    /* access modifiers changed from: private */
    public final zzbil zzd;
    /* access modifiers changed from: private */
    public final zzbtn zze;
    /* access modifiers changed from: private */
    public final zzbim zzf;
    /* access modifiers changed from: private */
    public zzbup zzg;
    /* access modifiers changed from: private */
    public final zzl zzh;

    public zzaz(zzk zzk, zzi zzi, zzfg zzfg, zzbil zzbil, zzbxh zzbxh, zzbtn zzbtn, zzbim zzbim, zzl zzl) {
        this.zza = zzk;
        this.zzb = zzi;
        this.zzc = zzfg;
        this.zzd = zzbil;
        this.zze = zzbtn;
        this.zzf = zzbim;
        this.zzh = zzl;
    }

    static /* bridge */ /* synthetic */ void zzv(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzbb.zzb().zzs(context, zzbb.zzc().afmaVersion, "gmob-apps", bundle, true);
    }

    public final zzbt zzd(Context context, String str, zzbpq zzbpq) {
        return (zzbt) new zzaq(this, context, str, zzbpq).zzd(context, false);
    }

    public final zzbx zze(Context context, zzr zzr, String str, zzbpq zzbpq) {
        return (zzbx) new zzam(this, context, zzr, str, zzbpq).zzd(context, false);
    }

    public final zzbx zzf(Context context, zzr zzr, String str, zzbpq zzbpq) {
        return (zzbx) new zzao(this, context, zzr, str, zzbpq).zzd(context, false);
    }

    public final zzck zzg(Context context, zzbpq zzbpq) {
        return (zzck) new zzas(this, context, zzbpq).zzd(context, false);
    }

    public final zzdw zzh(Context context, zzbpq zzbpq) {
        return (zzdw) new zzae(this, context, zzbpq).zzd(context, false);
    }

    public final zzbgt zzj(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbgt) new zzaw(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbgz zzk(View view, HashMap hashMap, HashMap hashMap2) {
        return (zzbgz) new zzay(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    public final zzblh zzn(Context context, zzbpq zzbpq, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzblh) new zzak(this, context, zzbpq, onH5AdsEventListener).zzd(context, false);
    }

    public final zzbtj zzo(Context context, zzbpq zzbpq) {
        return (zzbtj) new zzai(this, context, zzbpq).zzd(context, false);
    }

    public final zzbtq zzq(Activity activity) {
        zzac zzac = new zzac(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzo.zzg("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (zzbtq) zzac.zzd(activity, z);
    }

    public final zzbwv zzs(Context context, String str, zzbpq zzbpq) {
        return (zzbwv) new zzaa(this, context, str, zzbpq).zzd(context, false);
    }

    public final zzbza zzt(Context context, zzbpq zzbpq) {
        return (zzbza) new zzag(this, context, zzbpq).zzd(context, false);
    }
}
