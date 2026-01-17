package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzej {
    /* access modifiers changed from: private */
    public final HashSet zza = new HashSet();
    /* access modifiers changed from: private */
    public final Bundle zzb = new Bundle();
    /* access modifiers changed from: private */
    public final HashMap zzc = new HashMap();
    /* access modifiers changed from: private */
    public final HashSet zzd = new HashSet();
    /* access modifiers changed from: private */
    public final Bundle zze = new Bundle();
    /* access modifiers changed from: private */
    public final HashSet zzf = new HashSet();
    /* access modifiers changed from: private */
    public String zzg;
    /* access modifiers changed from: private */
    public final List zzh = new ArrayList();
    /* access modifiers changed from: private */
    public String zzi;
    /* access modifiers changed from: private */
    public String zzj;
    /* access modifiers changed from: private */
    public int zzk = -1;
    /* access modifiers changed from: private */
    public boolean zzl;
    /* access modifiers changed from: private */
    public String zzm;
    /* access modifiers changed from: private */
    public int zzn = 60000;
    /* access modifiers changed from: private */
    public long zzo;

    public final void zzA(Bundle bundle) {
        this.zzb.putAll(bundle);
    }

    public final void zzB(long j) {
        this.zzo = j;
    }

    public final void zzC(String str) {
        this.zzi = str;
    }

    public final void zzD(String str) {
        this.zzj = str;
    }

    @Deprecated
    public final void zzE(boolean z) {
        this.zzk = z ? 1 : 0;
    }

    public final void zzo(String str) {
        this.zzf.add(str);
    }

    public final void zzp(Class cls, Bundle bundle) {
        Bundle bundle2 = this.zzb;
        if (bundle2.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            bundle2.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        Bundle bundle3 = bundle2.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        Preconditions.checkNotNull(bundle3);
        bundle3.putBundle(cls.getName(), bundle);
    }

    public final void zzq(String str, String str2) {
        this.zze.putString(str, str2);
    }

    public final void zzr(String str) {
        this.zza.add(str);
    }

    public final void zzs(Class cls, Bundle bundle) {
        this.zzb.putBundle(cls.getName(), bundle);
    }

    public final void zzt(String str) {
        this.zzd.add(str);
    }

    public final void zzu(String str) {
        this.zzd.remove(AdRequest.DEVICE_ID_EMULATOR);
    }

    public final void zzv(String str) {
        this.zzm = str;
    }

    public final void zzw(String str) {
        this.zzg = str;
    }

    public final void zzx(int i) {
        this.zzn = i;
    }

    @Deprecated
    public final void zzy(boolean z) {
        this.zzl = z;
    }

    public final void zzz(List list) {
        List list2 = this.zzh;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                zzo.zzj("neighboring content URL should not be null or empty");
            } else {
                list2.add(str);
            }
        }
    }
}
