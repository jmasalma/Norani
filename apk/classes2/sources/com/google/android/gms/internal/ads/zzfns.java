package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfns implements zzfmt {
    private static final zzfns zza = new zzfns();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public static Handler zzc = null;
    /* access modifiers changed from: private */
    public static final Runnable zzd = new zzfno();
    /* access modifiers changed from: private */
    public static final Runnable zze = new zzfnp();
    private final List zzf = new ArrayList();
    private int zzg;
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfmv zzj = new zzfmv();
    private final zzfnl zzk = new zzfnl();
    /* access modifiers changed from: private */
    public final zzfnm zzl = new zzfnm(new zzfnv());
    private long zzm;

    zzfns() {
    }

    public static zzfns zzd() {
        return zza;
    }

    static /* bridge */ /* synthetic */ void zzg(zzfns zzfns) {
        zzfns.zzg = 0;
        zzfns.zzi.clear();
        zzfns.zzh = false;
        for (zzflp zzflp : zzfmi.zza().zzb()) {
        }
        zzfns.zzm = System.nanoTime();
        zzfnl zzfnl = zzfns.zzk;
        zzfnl.zzi();
        long nanoTime = System.nanoTime();
        zzfmv zzfmv = zzfns.zzj;
        zzfmu zza2 = zzfmv.zza();
        if (zzfnl.zze().size() > 0) {
            Iterator it = zzfnl.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zza2.zza((View) null);
                View zza4 = zzfnl.zza(str);
                zzfmu zzb2 = zzfmv.zzb();
                String zzc2 = zzfnl.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzfne.zzb(zza5, str);
                    try {
                        zza5.put("notVisibleReason", zzc2);
                    } catch (JSONException e) {
                        zzfnf.zza("Error with setting not visible reason", e);
                    }
                    zzfne.zzc(zza3, zza5);
                }
                zzfne.zzf(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfns.zzl.zzc(zza3, hashSet, nanoTime);
            }
        }
        zzfnl zzfnl2 = zzfns.zzk;
        if (zzfnl2.zzf().size() > 0) {
            JSONObject zza6 = zza2.zza((View) null);
            zzfns.zzk((View) null, zza2, zza6, 1, false);
            zzfne.zzf(zza6);
            zzfns.zzl.zzd(zza6, zzfnl2.zzf(), nanoTime);
            boolean z = zzfns.zzh;
        } else {
            zzfns.zzl.zzb();
        }
        zzfnl2.zzg();
        long nanoTime2 = System.nanoTime() - zzfns.zzm;
        List<zzfnr> list = zzfns.zzf;
        if (list.size() > 0) {
            for (zzfnr zzfnr : list) {
                int i = zzfns.zzg;
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfnr.zzb();
                if (zzfnr instanceof zzfnq) {
                    int i2 = zzfns.zzg;
                    ((zzfnq) zzfnr).zza();
                }
            }
        }
        zzfms.zza().zzc();
    }

    private final void zzk(View view, zzfmu zzfmu, JSONObject jSONObject, int i, boolean z) {
        boolean z2 = true;
        if (i != 1) {
            z2 = false;
        }
        zzfmu.zzb(view, jSONObject, this, z2, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    public final void zza(View view, zzfmu zzfmu, JSONObject jSONObject, boolean z) {
        zzfnl zzfnl;
        int zzl2;
        boolean z2;
        if (zzfnj.zza(view) == null && (zzl2 = zzfnl.zzl(view)) != 3) {
            JSONObject zza2 = zzfmu.zza(view);
            zzfne.zzc(jSONObject, zza2);
            String zzd2 = (zzfnl = this.zzk).zzd(view);
            if (zzd2 != null) {
                zzfne.zzb(zza2, zzd2);
                try {
                    zza2.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzk(view)));
                } catch (JSONException e) {
                    zzfnf.zza("Error with setting has window focus", e);
                }
                Boolean valueOf = Boolean.valueOf(this.zzk.zzj(zzd2));
                if (valueOf.booleanValue()) {
                    try {
                        zza2.put("isPipActive", valueOf);
                    } catch (JSONException e2) {
                        zzfnf.zza("Error with setting is picture-in-picture active", e2);
                    }
                }
                this.zzk.zzh();
            } else {
                zzfnk zzb2 = zzfnl.zzb(view);
                if (zzb2 != null) {
                    zzfml zza3 = zzb2.zza();
                    JSONArray jSONArray = new JSONArray();
                    ArrayList zzb3 = zzb2.zzb();
                    int size = zzb3.size();
                    for (int i = 0; i < size; i++) {
                        jSONArray.put((String) zzb3.get(i));
                    }
                    try {
                        zza2.put("isFriendlyObstructionFor", jSONArray);
                        zza2.put("friendlyObstructionClass", zza3.zzd());
                        zza2.put("friendlyObstructionPurpose", zza3.zza());
                        zza2.put("friendlyObstructionReason", zza3.zzc());
                    } catch (JSONException e3) {
                        zzfnf.zza("Error with setting friendly obstruction", e3);
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                zzk(view, zzfmu, zza2, zzl2, z || z2);
            }
            this.zzg++;
        }
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfnn(this));
    }
}
