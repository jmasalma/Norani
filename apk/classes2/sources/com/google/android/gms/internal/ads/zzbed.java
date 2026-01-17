package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.android.gms.ads.internal.client.zzbd;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbed extends CustomTabsServiceConnection {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private Context zzc;
    private zzdsj zzd;
    private CustomTabsSession zze;
    private CustomTabsClient zzf;

    public static /* synthetic */ void zzb(zzbed zzbed, int i) {
        zzdsj zzdsj = zzbed.zzd;
        if (zzdsj != null) {
            zzdsi zza2 = zzdsj.zza();
            zza2.zzb("action", "cct_nav");
            zza2.zzb("cct_navs", String.valueOf(i));
            zza2.zzj();
        }
    }

    /* access modifiers changed from: private */
    public final void zzf(Context context) {
        String packageName;
        if (this.zzf == null && context != null && (packageName = CustomTabsClient.getPackageName(context, (List) null)) != null && !packageName.equals(context.getPackageName())) {
            CustomTabsClient.bindCustomTabsService(context, packageName, this);
        }
    }

    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        this.zzf = customTabsClient;
        customTabsClient.warmup(0);
        this.zze = customTabsClient.newSession(new zzbec(this));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final CustomTabsSession zza() {
        if (this.zze == null) {
            zzcaf.zza.execute(new zzbeb(this));
        }
        return this.zze;
    }

    public final void zzd(Context context, zzdsj zzdsj) {
        if (!this.zzb.getAndSet(true)) {
            this.zzc = context;
            this.zzd = zzdsj;
            zzf(context);
        }
    }

    public final void zze(int i) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzeS)).booleanValue() && this.zzd != null) {
            zzcaf.zza.execute(new zzbea(this, i));
        }
    }
}
