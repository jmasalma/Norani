package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzdss {
    protected final Map zza = new HashMap();
    protected final Context zzb;
    protected final Executor zzc;
    protected final zzu zzd;
    protected final boolean zze;
    private final CsiUrlBuilder zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final AtomicBoolean zzi = new AtomicBoolean();
    private final AtomicReference zzj = new AtomicReference(new Bundle());

    protected zzdss(Executor executor, zzu zzu, CsiUrlBuilder csiUrlBuilder, Context context) {
        String str = (String) zzbey.zza.zze();
        this.zzc = executor;
        this.zzd = zzu;
        this.zze = ((Boolean) zzbd.zzc().zzb(zzbde.zzcj)).booleanValue();
        this.zzf = csiUrlBuilder;
        this.zzg = ((Boolean) zzbd.zzc().zzb(zzbde.zzco)).booleanValue();
        this.zzh = ((Boolean) zzbd.zzc().zzb(zzbde.zzhh)).booleanValue();
        this.zzb = context;
    }

    private final void zza(Map map) {
        if (map == null || map.isEmpty()) {
            int i = zze.zza;
            zzo.zze("Empty or null paramMap.");
            return;
        }
        if (!this.zzi.getAndSet(true)) {
            String str = (String) zzbd.zzc().zzb(zzbde.zzkW);
            this.zzj.set(zzad.zza(this.zzb, str, new zzdsq(this, str)));
        }
        Bundle bundle = (Bundle) this.zzj.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    private final void zzh(Map map, boolean z) {
        if (map.isEmpty()) {
            int i = zze.zza;
            zzo.zze("Empty paramMap.");
            return;
        }
        zza(map);
        String generateUrl = this.zzf.generateUrl(map);
        zze.zza(generateUrl);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (!this.zze) {
            return;
        }
        if (z && !this.zzg) {
            return;
        }
        if (!parseBoolean || this.zzh) {
            this.zzc.execute(new zzdsp(this, generateUrl));
        }
    }

    /* access modifiers changed from: protected */
    public final String zzb(Map map) {
        return this.zzf.generateUrl(map);
    }

    public final ConcurrentHashMap zzc() {
        return new ConcurrentHashMap(this.zza);
    }

    public final void zze(Map map) {
        if (map.isEmpty()) {
            int i = zze.zza;
            zzo.zze("Empty paramMap.");
            return;
        }
        zza(map);
        String generateUrl = this.zzf.generateUrl(map);
        zze.zza(generateUrl);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zznA)).booleanValue() || this.zze) {
            this.zzc.execute(new zzdsr(this, generateUrl));
        }
    }

    public final void zzf(Map map) {
        zzh(map, true);
    }

    public final void zzg(Map map) {
        zzh(map, false);
    }
}
