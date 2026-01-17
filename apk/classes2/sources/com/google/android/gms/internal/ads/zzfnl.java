package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfnl {
    private final HashMap zza = new HashMap();
    private final HashMap zzb = new HashMap();
    private final HashMap zzc = new HashMap();
    private final HashSet zzd = new HashSet();
    private final HashSet zze = new HashSet();
    private final HashSet zzf = new HashSet();
    private final HashMap zzg = new HashMap();
    private final HashSet zzh = new HashSet();
    private final Map zzi = new WeakHashMap();
    private boolean zzj;

    public final View zza(String str) {
        return (View) this.zzc.get(str);
    }

    public final zzfnk zzb(View view) {
        HashMap hashMap = this.zzb;
        zzfnk zzfnk = (zzfnk) hashMap.get(view);
        if (zzfnk != null) {
            hashMap.remove(view);
        }
        return zzfnk;
    }

    public final String zzc(String str) {
        return (String) this.zzg.get(str);
    }

    public final String zzd(View view) {
        HashMap hashMap = this.zza;
        if (hashMap.size() == 0) {
            return null;
        }
        String str = (String) hashMap.get(view);
        if (str != null) {
            hashMap.remove(view);
        }
        return str;
    }

    public final HashSet zze() {
        return this.zzf;
    }

    public final HashSet zzf() {
        return this.zze;
    }

    public final void zzg() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
        this.zzh.clear();
    }

    public final void zzh() {
        this.zzj = true;
    }

    public final void zzi() {
        String str;
        Activity activity;
        Boolean bool;
        zzfmi zza2 = zzfmi.zza();
        if (zza2 != null) {
            for (zzflp zzflp : zza2.zzb()) {
                View zzf2 = zzflp.zzf();
                if (zzflp.zzj()) {
                    String zzh2 = zzflp.zzh();
                    if (zzf2 != null) {
                        Context context = zzf2.getContext();
                        while (true) {
                            str = null;
                            if (!(context instanceof ContextWrapper)) {
                                activity = null;
                                break;
                            } else if (context instanceof Activity) {
                                activity = (Activity) context;
                                break;
                            } else {
                                context = ((ContextWrapper) context).getBaseContext();
                            }
                        }
                        boolean isInPictureInPictureMode = activity != null ? activity.isInPictureInPictureMode() : false;
                        if (isInPictureInPictureMode) {
                            this.zzh.add(zzh2);
                        }
                        if (!zzf2.isAttachedToWindow()) {
                            str = "notAttached";
                        } else {
                            if (zzf2.hasWindowFocus()) {
                                this.zzi.remove(zzf2);
                                bool = false;
                            } else {
                                Map map = this.zzi;
                                if (map.containsKey(zzf2)) {
                                    bool = (Boolean) map.get(zzf2);
                                } else {
                                    bool = false;
                                    map.put(zzf2, bool);
                                }
                            }
                            if (!bool.booleanValue() || isInPictureInPictureMode) {
                                HashSet hashSet = new HashSet();
                                View view = zzf2;
                                while (true) {
                                    if (view == null) {
                                        this.zzd.addAll(hashSet);
                                        break;
                                    }
                                    String zza3 = zzfnj.zza(view);
                                    if (zza3 != null) {
                                        str = zza3;
                                        break;
                                    }
                                    hashSet.add(view);
                                    ViewParent parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        }
                        if (str == null) {
                            this.zze.add(zzh2);
                            this.zza.put(zzf2, zzh2);
                            for (zzfml zzfml : zzflp.zzi()) {
                                View view2 = (View) zzfml.zzb().get();
                                if (view2 != null) {
                                    HashMap hashMap = this.zzb;
                                    zzfnk zzfnk = (zzfnk) hashMap.get(view2);
                                    if (zzfnk != null) {
                                        zzfnk.zzc(zzflp.zzh());
                                    } else {
                                        hashMap.put(view2, new zzfnk(zzfml, zzflp.zzh()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.zzf.add(zzh2);
                            this.zzc.put(zzh2, zzf2);
                            this.zzg.put(zzh2, str);
                        }
                    } else {
                        this.zzf.add(zzh2);
                        this.zzg.put(zzh2, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean zzj(String str) {
        return this.zzh.contains(str);
    }

    public final boolean zzk(View view) {
        Map map = this.zzi;
        if (!map.containsKey(view)) {
            return true;
        }
        map.put(view, true);
        return false;
    }

    public final int zzl(View view) {
        if (this.zzd.contains(view)) {
            return 1;
        }
        return this.zzj ? 2 : 3;
    }
}
