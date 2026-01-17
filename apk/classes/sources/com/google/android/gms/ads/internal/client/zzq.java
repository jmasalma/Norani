package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzq {
    public static final zzq zza = new zzq();

    protected zzq() {
    }

    public final zzm zza(Context context, zzek zzek) {
        List list;
        Context context2;
        String str;
        zzek zzek2 = zzek;
        String zzj = zzek.zzj();
        Set zzo = zzek.zzo();
        if (!zzo.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(zzo));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean zzr = zzek2.zzr(context2);
        Bundle zzg = zzek2.zzg(AdMobAdapter.class);
        String zzk = zzek.zzk();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzbb.zzb();
            str = zzf.zzv(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean zzq = zzek.zzq();
        RequestConfiguration zzc = zzey.zzf().zzc();
        int max = Math.max(zzek.zzb(), zzc.getTagForChildDirectedTreatment());
        String[] strArr = {null, zzc.getMaxAdContentRating()};
        return new zzm(8, -1, zzg, -1, list, zzr, max, false, zzk, (zzfz) null, (Location) null, zzj, zzek.zzh(), zzek.zzf(), Collections.unmodifiableList(new ArrayList(zzek.zzn())), zzek.zzl(), str, zzq, (zzc) null, zzc.getTagForUnderAgeOfConsent(), (String) Collections.max(Arrays.asList(strArr), new zzp()), zzek.zzm(), zzek.zza(), zzek.zzi(), zzc.getPublisherPrivacyPersonalizationState().getValue(), zzek.zzd(), zzek.zzc());
    }
}
