# Patches for jellyfishport

`jellyfish` is cross-compiled on Linux-on-Power targeting `s390x-ibm-zos` using IBM's Rust cross-compilation infrastructure (`pyo3 0.29.2`, `libc 0.2.189`, `getrandom 0.3.3`, `target-lexicon 0.13.5`).

The prebuilt wheel archives are uploaded directly as GitHub release assets to this repository for consumption by `buildenv` during installation.

Full build scripts and patch details are preserved in [rust-scripts](https://github.ibm.com/compiler/rust-scripts) under `cross/patches/jellyfish-zos/`.
