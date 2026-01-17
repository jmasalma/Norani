package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import kotlin.io.ConstantsKt;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzero implements zzeuc {
    private final zzgdy zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzero(zzgdy zzgdy, ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzgdy;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    public static /* synthetic */ zzerp zzc(zzero zzero) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzgg)).booleanValue() && zzero.zzb != null && zzero.zzd.contains("banner")) {
            return new zzerp(Boolean.valueOf(zzero.zzb.isHardwareAccelerated()));
        }
        boolean z = null;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzgh)).booleanValue() && zzero.zzd.contains("native")) {
            Context context = zzero.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                boolean z2 = true;
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
                            z2 = false;
                        }
                        z = Boolean.valueOf(z2);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    z = true;
                }
                return new zzerp(z);
            }
        }
        return new zzerp((Boolean) null);
    }

    public final int zza() {
        return 22;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzern(this));
    }
}
