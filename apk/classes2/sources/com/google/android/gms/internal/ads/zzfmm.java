package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfmm {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final List zzb = new ArrayList();

    public final List zza() {
        return this.zzb;
    }

    public final void zzb(View view, zzfls zzfls, String str) {
        zzfml zzfml;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        } else if (zza.matcher("Ad overlay").matches()) {
            List list = this.zzb;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    zzfml = null;
                    break;
                }
                zzfml = (zzfml) it.next();
                if (zzfml.zzb().get() == view) {
                    break;
                }
            }
            if (zzfml == null) {
                list.add(new zzfml(view, zzfls, "Ad overlay"));
            }
        } else {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    public final void zzc() {
        this.zzb.clear();
    }
}
