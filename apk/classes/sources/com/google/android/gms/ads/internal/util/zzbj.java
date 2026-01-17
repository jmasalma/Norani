package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.internal.ads.zzapl;
import com.google.android.gms.internal.ads.zzaqh;
import com.google.android.gms.internal.ads.zzaqi;
import com.google.android.gms.internal.ads.zzari;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbj extends zzari {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ zzl zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbj(zzbo zzbo, int i, String str, zzaqi zzaqi, zzaqh zzaqh, byte[] bArr, Map map, zzl zzl) {
        super(i, str, zzaqi, zzaqh);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzl;
        Objects.requireNonNull(zzbo);
    }

    public final Map zzl() throws zzapl {
        Map map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzz((String) obj);
    }

    public final byte[] zzx() throws zzapl {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public final void zzz(String str) {
        this.zzc.zzg(str);
        zzbj.super.zzz(str);
    }
}
