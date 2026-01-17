package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfmw implements zzfmu {
    private final zzfmu zza;

    public zzfmw(zzfmu zzfmu) {
        this.zza = zzfmu;
    }

    public final JSONObject zza(View view) {
        boolean z = false;
        JSONObject zza2 = zzfne.zza(0, 0, 0, 0);
        int zzb = zzfnh.zzb();
        int i = zzb - 1;
        if (zzb != 0) {
            if (i == 0) {
                z = true;
            }
            try {
                zza2.put("noOutputDevice", z);
            } catch (JSONException e) {
                zzfnf.zza("Error with setting output device status", e);
            }
            return zza2;
        }
        throw null;
    }

    public final void zzb(View view, JSONObject jSONObject, zzfmt zzfmt, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        zzfmi zza2 = zzfmi.zza();
        if (zza2 != null) {
            Collection<zzflp> zzb = zza2.zzb();
            int size = zzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (zzflp zzf : zzb) {
                View zzf2 = zzf.zzf();
                if (zzf2 != null && zzf2.isAttachedToWindow() && zzf2.isShown()) {
                    View view2 = zzf2;
                    while (true) {
                        if (view2 != null) {
                            if (view2.getAlpha() == 0.0f) {
                                break;
                            }
                            ViewParent parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        } else {
                            View rootView = zzf2.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z3 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (((View) arrayList.get(i)).getZ() <= z3) {
                                        break;
                                    }
                                    size2 = i;
                                }
                                arrayList.add(size2, rootView);
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            zzfmt.zza((View) arrayList.get(i2), this.zza, jSONObject, z2);
        }
    }
}
