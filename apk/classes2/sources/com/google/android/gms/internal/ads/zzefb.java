package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzad;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzefb implements zzedm {
    private final Context zza;
    private final zzdgf zzb;
    private final Executor zzc;
    private final zzfbz zzd;
    /* access modifiers changed from: private */
    public final zzdsj zze;

    public zzefb(Context context, Executor executor, zzdgf zzdgf, zzfbz zzfbz, zzdsj zzdsj) {
        this.zza = context;
        this.zzb = zzdgf;
        this.zzc = executor;
        this.zzd = zzfbz;
        this.zze = zzdsj;
    }

    public static /* synthetic */ ListenableFuture zzd(zzefb zzefb, Uri uri, zzfcn zzfcn, zzfca zzfca, zzfcd zzfcd, Object obj) {
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.setData(uri);
            zzc zzc2 = new zzc(build.intent, (zzaa) null);
            zzcak zzcak = new zzcak();
            zzdfc zzd2 = zzefb.zzb.zzd(new zzcrq(zzfcn, zzfca, (String) null), new zzdff(new zzefa(zzefb, zzcak, zzfca), (zzcfg) null));
            zzcak.zzc(new AdOverlayInfoParcel(zzc2, (zza) null, zzd2.zza(), (zzad) null, new VersionInfoParcel(0, 0, false), (zzcfg) null, (zzded) null, zzfcd.zzb));
            zzefb.zzd.zza();
            return zzgdn.zzh(zzd2.zzg());
        } catch (Throwable th) {
            int i = zze.zza;
            zzo.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    private static String zze(zzfca zzfca) {
        try {
            return zzfca.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    public final ListenableFuture zza(zzfcn zzfcn, zzfca zzfca) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zznw)).booleanValue()) {
            zzdsi zza2 = this.zze.zza();
            zza2.zzb("action", "cstm_tbs_rndr");
            zza2.zzj();
        }
        String zze2 = zze(zzfca);
        return zzgdn.zzn(zzgdn.zzh((Object) null), new zzeez(this, zze2 != null ? Uri.parse(zze2) : null, zzfcn, zzfca, zzfcn.zzb.zzb), this.zzc);
    }

    public final boolean zzb(zzfcn zzfcn, zzfca zzfca) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbef.zzg(context) && !TextUtils.isEmpty(zze(zzfca));
    }
}
