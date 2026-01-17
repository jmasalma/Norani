package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzema implements zzeuc {
    private final zzgdy zza;
    private final Context zzb;
    private final zzfcw zzc;
    private final View zzd;

    public zzema(zzgdy zzgdy, Context context, zzfcw zzfcw, ViewGroup viewGroup) {
        this.zza = zzgdy;
        this.zzb = context;
        this.zzc = zzfcw;
        this.zzd = viewGroup;
    }

    public static /* synthetic */ zzemb zzc(zzema zzema) {
        ArrayList arrayList = new ArrayList();
        View view = zzema.zzd;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzemb(zzema.zzb, zzema.zzc.zze, arrayList);
    }

    public final int zza() {
        return 3;
    }

    public final ListenableFuture zzb() {
        zzbde.zza(this.zzb);
        return this.zza.zzb(new zzelz(this));
    }
}
