package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbnl implements zzbnd, zzbnc {
    private final zzcfg zza;

    public zzbnl(Context context, VersionInfoParcel versionInfoParcel, zzavu zzavu, zza zza2) throws zzcfs {
        zzv.zzB();
        zzcfg zza3 = zzcft.zza(context, zzchd.zza(), "", false, false, (zzavu) null, (zzbel) null, versionInfoParcel, (zzbdt) null, (zzn) null, (zza) null, zzbcc.zza(), (zzfca) null, (zzfcd) null, (zzecl) null, (zzfda) null, (zzdsj) null);
        this.zza = zza3;
        zza3.zzF().setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        zzbb.zzb();
        if (zzf.zzz()) {
            zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
            return;
        }
        zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
        if (!zzs.zza.post(runnable)) {
            zzo.zzj("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    public final void zza(String str) {
        zze.zza("invokeJavascript on adWebView from js");
        zzs(new zzbnh(this, str));
    }

    public final /* synthetic */ void zzb(String str, String str2) {
        zzbnb.zzc(this, str, str2);
    }

    public final void zzc() {
        this.zza.destroy();
    }

    public final /* synthetic */ void zzd(String str, Map map) {
        zzbnb.zza(this, str, map);
    }

    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbnb.zzb(this, str, jSONObject);
    }

    public final void zzf(String str) {
        zze.zza("loadHtml on adWebView from html");
        zzs(new zzbni(this, str));
    }

    public final void zzg(String str) {
        zze.zza("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new zzbnf(this, str));
    }

    public final void zzh(String str) {
        zze.zza("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new zzbnj(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public final boolean zzi() {
        return this.zza.zzaE();
    }

    public final zzbok zzj() {
        return new zzbok(this);
    }

    public final void zzk(zzbno zzbno) {
        zzcgy zzN = this.zza.zzN();
        Objects.requireNonNull(zzbno);
        zzN.zzK(new zzbng(zzbno));
    }

    public final /* synthetic */ void zzp(String str, JSONObject jSONObject) {
        zzbnb.zzd(this, str, jSONObject);
    }

    public final void zzq(String str, zzbkf zzbkf) {
        this.zza.zzag(str, new zzbnk(this, zzbkf));
    }

    public final void zzr(String str, zzbkf zzbkf) {
        this.zza.zzaA(str, new zzbne(zzbkf));
    }
}
