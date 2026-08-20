# Patches and Cross-Compilation Config for jellyfish 1.2.1 on z/OS

`jellyfish` contains a compiled Rust extension (`_rustyfish`) using PyO3.

## Patch Details

1. **`jellyfish-1.2.1-zos.patch`**:
   - Changes `[lib] name = "_rustyfish"` in `Cargo.toml` so the GOFF DLL module name matches the Python pymodule export name.
   - Sets `default = ["python"]` so PyO3 module bindings in `src/rustyfish.rs` are compiled into the cdylib by default.

2. **`getrandom-0.3.3-zos.patch`**:
   - Adds z/OS support to `getrandom 0.3.3` (uses `/dev/urandom` via `use_file` backend).

3. **`cargo-config.toml`**:
   - Target configuration for `s390x-ibm-zos` with disable-vector rustflag and Python side-deck linkage.
