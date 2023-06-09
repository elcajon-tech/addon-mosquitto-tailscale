ARG BUILD_FROM=ghcr.io/hassio-addons/base/amd64:14.0.2
# hadolint ignore=DL3006
FROM ${BUILD_FROM}

# Set S6 verbosity level
ENV S6_VERBOSITY=1

# Set shell
SHELL ["/bin/bash", "-o", "pipefail", "-c"]

# Setup base
ARG BUILD_ARCH=amd64
ARG TAILSCALE_VERSION="v1.44.0"
RUN \
    apk add --no-cache \
        ip6tables=1.8.9-r2 \
        ipcalc=1.0.2-r0 \
        iproute2=6.3.0-r0 \
        iptables=1.8.9-r2 \
        mosquitto=2.0.15-r3 \
        pwgen=2.08-r3 \
    \
    && ln -sf /sbin/xtables-nft-multi /sbin/ip6tables \
    && ln -sf /sbin/xtables-nft-multi /sbin/iptables \
    \
    && if [ "${BUILD_ARCH}" = "aarch64" ]; then ARCH="arm64"; fi \
    && if [ "${BUILD_ARCH}" = "armhf" ]; then ARCH="arm"; fi \
    && if [ "${BUILD_ARCH}" = "armv7" ]; then ARCH="arm"; fi \
    && if [ "${BUILD_ARCH}" = "amd64" ]; then ARCH="amd64"; fi \
    && if [ "${BUILD_ARCH}" = "i386" ]; then ARCH="386"; fi \
    \
    && curl -L -s \
        "https://pkgs.tailscale.com/stable/tailscale_${TAILSCALE_VERSION#v}_${ARCH}.tgz" \
        | tar zxvf - -C /usr/local/bin/ --strip-components 1 \
    \
    && rm -f -r \
        /opt/systemd \
        /etc/cont-init.d \
        /package/admin/s6-overlay/etc/s6-rc/sources/base/contents.d/legacy-cont-init \
        /package/admin/s6-overlay/etc/s6-rc/sources/base/contents.d/fix-attrs \
        /package/admin/s6-overlay/etc/s6-rc/sources/top/contents.d/legacy-services

# Copy root filesystem
COPY rootfs /

# Build arguments
ARG BUILD_ARCH
ARG BUILD_DATE
ARG BUILD_DESCRIPTION
ARG BUILD_NAME
ARG BUILD_REF
ARG BUILD_REPOSITORY
ARG BUILD_VERSION

# Labels
LABEL \
    io.hass.name="${BUILD_NAME}" \
    io.hass.description="${BUILD_DESCRIPTION}" \
    io.hass.arch="${BUILD_ARCH}" \
    io.hass.type="addon" \
    io.hass.version=${BUILD_VERSION} \
    org.opencontainers.image.title="${BUILD_NAME}" \
    org.opencontainers.image.description="${BUILD_DESCRIPTION}" \
    org.opencontainers.image.licenses="MIT" \
    org.opencontainers.image.source="https://github.com/${BUILD_REPOSITORY}" \
    org.opencontainers.image.documentation="https://github.com/${BUILD_REPOSITORY}/blob/main/README.md" \
    org.opencontainers.image.created=${BUILD_DATE} \
    org.opencontainers.image.revision=${BUILD_REF} \
    org.opencontainers.image.version=${BUILD_VERSION}
