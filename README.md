# jellyfishport

z/OS port of [jellyfish](https://github.com/jamesturk/jellyfish), a Python library for approximate and phonetic matching of strings (Levenshtein, Damerau-Levenshtein, Jaro, Jaro-Winkler, Hamming, Soundex, Metaphone, NYSIIS, Match Rating Approach) implemented in Rust with PyO3.

## Overview

`jellyfish` contains a compiled Rust extension (`_rustyfish`) that cannot be compiled natively on z/OS because there is no native Rust compiler for z/OS.

Prebuilt wheels are cross-compiled from Linux-on-Power using IBM's Rust cross-compiler (`s390x-ibm-zos`) and published as release assets on this repository. When installing via `zopen install jellyfish` or building this port, `buildenv` downloads the appropriate prebuilt wheel for each installed Python version (3.12, 3.13, 3.14).

## Supported Python Versions

- Python 3.12 (`cp312-cp312-os390_29_00_8561`)
- Python 3.13 (`cp313-cp313-os390_29_00_8561`)
- Python 3.14 (`cp314-cp314-zos`)

## Cross-compilation Infrastructure

The cross-compilation pipeline and patches are maintained in the [rust-scripts](https://github.ibm.com/compiler/rust-scripts) repository (`itodorov/zos-cross-compile-setup` branch).
