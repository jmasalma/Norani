package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcx {
    private static final String zza = Integer.toString(0, 36);
    private static final String zzb = Integer.toString(1, 36);
    private static final String zzc = Integer.toString(2, 36);
    private static final String zzd = Integer.toString(3, 36);
    private static final String zze = Integer.toString(4, 36);

    static {
        String str = zzex.zza;
    }

    public static ArrayList zza(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (zzcz zzcz : (zzcz[]) spanned.getSpans(0, spanned.length(), zzcz.class)) {
            arrayList.add(zzb(spanned, zzcz, 1, zzcz.zza()));
        }
        for (zzdb zzdb : (zzdb[]) spanned.getSpans(0, spanned.length(), zzdb.class)) {
            arrayList.add(zzb(spanned, zzdb, 2, zzdb.zza()));
        }
        for (zzcy zzb2 : (zzcy[]) spanned.getSpans(0, spanned.length(), zzcy.class)) {
            arrayList.add(zzb(spanned, zzb2, 3, (Bundle) null));
        }
        for (zzdc zzdc : (zzdc[]) spanned.getSpans(0, spanned.length(), zzdc.class)) {
            arrayList.add(zzb(spanned, zzdc, 4, zzdc.zza()));
        }
        return arrayList;
    }

    private static Bundle zzb(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(zza, spanned.getSpanStart(obj));
        bundle2.putInt(zzb, spanned.getSpanEnd(obj));
        bundle2.putInt(zzc, spanned.getSpanFlags(obj));
        bundle2.putInt(zzd, i);
        if (bundle != null) {
            bundle2.putBundle(zze, bundle);
        }
        return bundle2;
    }
}
