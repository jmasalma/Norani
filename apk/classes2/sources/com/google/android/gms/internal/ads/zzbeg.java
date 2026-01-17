package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import androidx.browser.customtabs.CustomTabsCallback;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbeg extends CustomTabsCallback {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private final List zzb;
    private final zzbej zzc;
    private final CustomTabsCallback zzd;
    private final zzdso zze;

    zzbeg(zzbej zzbej, CustomTabsCallback customTabsCallback, zzdso zzdso) {
        this.zzd = customTabsCallback;
        this.zzc = zzbej;
        this.zze = zzdso;
        this.zzb = Arrays.asList(((String) zzbd.zzc().zzb(zzbde.zzkp)).split(","));
    }

    private final void zzb(String str) {
        zzaa.zzd(this.zze, (zzdsd) null, "pact_action", new Pair[]{new Pair("pe", str)});
    }

    public final void extraCallback(String str, Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.extraCallback(str, bundle);
        }
    }

    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            return customTabsCallback.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    public final void onActivityResized(int i, int i2, Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.onActivityResized(i, i2, bundle);
        }
    }

    public final void onMessageChannelReady(Bundle bundle) {
        this.zza.set(false);
        CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.onMessageChannelReady(bundle);
        }
    }

    public final void onNavigationEvent(int i, Bundle bundle) {
        List list;
        this.zza.set(false);
        CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.onNavigationEvent(i, bundle);
        }
        zzbej zzbej = this.zzc;
        zzbej.zzi(zzv.zzD().currentTimeMillis());
        if (zzbej != null && (list = this.zzb) != null && list.contains(String.valueOf(i))) {
            zzbej.zzf();
            zzb("pact_reqpmc");
        }
    }

    public final void onPostMessage(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.zza.set(true);
                zzb("pact_con");
                this.zzc.zzh(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e) {
            zze.zzb("Message is not in JSON format: ", e);
        }
        CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.onPostMessage(str, bundle);
        }
    }

    public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.zzd;
        if (customTabsCallback != null) {
            customTabsCallback.onRelationshipValidationResult(i, uri, z, bundle);
        }
    }

    public final Boolean zza() {
        return Boolean.valueOf(this.zza.get());
    }
}
