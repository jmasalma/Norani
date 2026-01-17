package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzewq implements zzhgr {
    public static zzeuf zza(Context context, zzbzg zzbzg, zzbzh zzbzh, Object obj, zzevi zzevi, zzewc zzewc, zzhgl zzhgl, zzhgl zzhgl2, zzhgl zzhgl3, zzhgl zzhgl4, zzhgl zzhgl5, zzhgl zzhgl6, zzhgl zzhgl7, Executor executor, zzfhu zzfhu, zzdsj zzdsj) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzevv) obj);
        hashSet.add(zzevi);
        hashSet.add(zzewc);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzgb)).booleanValue()) {
            hashSet.add((zzeuc) zzhgl.zzb());
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzgc)).booleanValue()) {
            hashSet.add((zzeuc) zzhgl2.zzb());
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzge)).booleanValue()) {
            hashSet.add((zzeuc) zzhgl4.zzb());
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzgf)).booleanValue()) {
            hashSet.add((zzeuc) zzhgl5.zzb());
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzdn)).booleanValue()) {
            hashSet.add((zzeuc) zzhgl7.zzb());
        }
        zzeuf zzeuf = new zzeuf(context, executor, hashSet, zzfhu, zzdsj);
        zzeuf zzeuf2 = zzeuf;
        return zzeuf;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
