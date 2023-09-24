#include "kernel_version.h"

kernel_version get_kernel_version() {
    struct utsname buffer;
    kernel_version kv = {0, 0, 0};

    if (uname(&buffer) != 0) {
        return kv;
    }

    char *p = buffer.release;
    kv.major = atoi(p);

    while (*p && *p != '.') p++;
    if (*p) p++;
    kv.minor = atoi(p);

    while (*p && *p != '.') p++;
    if (*p) p++;
    kv.patch = atoi(p);

    return kv;
}

kernel_version runtime_kernel_version = get_kernel_version();
