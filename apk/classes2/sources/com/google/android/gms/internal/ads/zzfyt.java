package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzfyt implements Map, Serializable {
    private transient zzfyv zza;
    private transient zzfyv zzb;
    private transient zzfyl zzc;

    zzfyt() {
    }

    public static zzfyt zzc(Map map) {
        Set entrySet = map.entrySet();
        zzfys zzfys = new zzfys(entrySet instanceof Collection ? entrySet.size() : 4);
        zzfys.zzb(entrySet);
        return zzfys.zzc();
    }

    public static zzfyt zzd() {
        return zzgah.zza;
    }

    public static zzfyt zze(Object obj, Object obj2) {
        zzfxn.zzb("dialog_not_shown_reason", obj2);
        return zzgah.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, (zzfys) null);
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final boolean equals(Object obj) {
        return zzfzn.zzb(this, obj);
    }

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public final int hashCode() {
        return zzgas.zza(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfxn.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public abstract zzfyl zza();

    /* renamed from: zzb */
    public final zzfyl values() {
        zzfyl zzfyl = this.zzc;
        if (zzfyl != null) {
            return zzfyl;
        }
        zzfyl zza2 = zza();
        this.zzc = zza2;
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public abstract zzfyv zzf();

    /* access modifiers changed from: package-private */
    public abstract zzfyv zzg();

    /* renamed from: zzh */
    public final zzfyv entrySet() {
        zzfyv zzfyv = this.zza;
        if (zzfyv != null) {
            return zzfyv;
        }
        zzfyv zzf = zzf();
        this.zza = zzf;
        return zzf;
    }

    /* renamed from: zzi */
    public final zzfyv keySet() {
        zzfyv zzfyv = this.zzb;
        if (zzfyv != null) {
            return zzfyv;
        }
        zzfyv zzg = zzg();
        this.zzb = zzg;
        return zzg;
    }
}
