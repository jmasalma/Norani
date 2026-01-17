package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzfwe {
    private final zzfwd zza;

    private zzfwe(zzfwd zzfwd) {
        int i = zzfuz.zzb;
        this.zza = zzfwd;
    }

    public static zzfwe zza(int i) {
        return new zzfwe(new zzfvv(4000));
    }

    public static zzfwe zzb(zzfva zzfva) {
        return new zzfwe(new zzfvw(zzfva));
    }

    public static zzfwe zzc(Pattern pattern) {
        zzfvg zzfvg = new zzfvg(pattern);
        zzfvp.zzi(!((zzfvf) zzfvg.zza("")).zza.matches(), "The pattern may not match the empty string: %s", zzfvg);
        return new zzfwe(new zzfvx(zzfvg));
    }

    /* access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zza.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new zzfwb(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        charSequence.getClass();
        Iterator zzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzg.hasNext()) {
            arrayList.add((String) zzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
