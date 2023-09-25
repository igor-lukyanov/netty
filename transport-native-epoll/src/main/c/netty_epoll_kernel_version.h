#ifndef KERNEL_VERSION_H
#define KERNEL_VERSION_H

#include <stdio.h>
#include <sys/utsname.h>
#include <stdlib.h>

typedef struct {
    int major;
    int minor;
    int patch;
} kernel_version;

kernel_version get_kernel_version();

#endif // KERNEL_VERSION_H
