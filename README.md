# Home Assistant Add-on: Mosquitto & Tailscale

[![GitHub Release][releases-shield]][releases]
![Project Stage][project-stage-shield]
[![License][license-shield]](LICENSE.md)

![Supports aarch64 Architecture][aarch64-shield]
![Supports amd64 Architecture][amd64-shield]
![Supports armhf Architecture][armhf-shield]
![Supports armv7 Architecture][armv7-shield]
![Supports i386 Architecture][i386-shield]

[![Github Actions][github-actions-shield]][github-actions]
![Project Maintenance][maintenance-shield]
[![GitHub Activity][commits-shield]][commits]

Zero config VPN for building secure networks and secure access to your
Home Assistant instance.

## About

Eclipse Mosquitto is an open-source (EPL/EDL licensed) message broker that
implements the MQTT protocol. Mosquitto is lightweight and is suitable for use
on all devices from low power single board computers to full servers.
For more information, please see [mosquitto].

Tailscale is a zero config VPN, which installs on any device in minutes,
including your Home Assistant instance.

This add-on allows to publish your Mosquitto server securely with Tailscale.

If you do not plan to access your Mosquitto server from outside your local
server, you can also use the official [Home-Assistand add-on][mosquitto-ha]
to set up your MQTT Mosquitto server.

[:books: Read the full add-on documentation][docs]

## Installation

To install this Add-On, manually add the HA-Addons repository to Home Assistant
using [this GitHub repository][ha-addons] or by clicking the button below.

[![Add Repository to HA][my-ha-badge]][my-ha-url]

[aarch64-shield]: https://img.shields.io/badge/aarch64-yes-green.svg
[amd64-shield]: https://img.shields.io/badge/amd64-yes-green.svg
[armhf-shield]: https://img.shields.io/badge/armhf-yes-green.svg
[armv7-shield]: https://img.shields.io/badge/armv7-yes-green.svg
[commits-shield]: https://img.shields.io/github/commit-activity/y/elcajon-tech/addon-mosquitto-tailscale.svg
[commits]: https://github.com/elcajon-tech/addon-mosquitto-tailscale/commits/main
[contributors]: https://github.com/elcajon-tech/addon-mosquitto-tailscale/graphs/contributors
[docs]: https://github.com/elcajon-tech/addon-mosquitto-tailscale/blob/main/tailscale/DOCS.md
[github-actions-shield]: https://github.com/elcajon-mosquitto-tech/addon-tailscale/workflows/CI/badge.svg
[github-actions]: https://github.com/elcajon-tech/addon-mosquitto-tailscale/actions
[i386-shield]: https://img.shields.io/badge/i386-yes-green.svg
[issue]: https://github.com/elcajon-tech/addon-mosquitto-tailscale/issues
[license-shield]: https://img.shields.io/github/license/elcajon-tech/addon-mosquitto-tailscale.svg
[maintenance-shield]: https://img.shields.io/maintenance/yes/2023.svg
[releases-shield]: https://img.shields.io/github/release/elcajon-tech/addon-mosquitto-tailscale.svg
[releases]: https://github.com/elcajon-tech/addon-mosquitto-tailscale/releases
[project-stage-shield]: https://img.shields.io/badge/project%20stage-production%20ready-brightgreen.svg
[my-ha-badge]: https://my.home-assistant.io/badges/supervisor_add_addon_repository.svg
[my-ha-url]: https://my.home-assistant.io/redirect/supervisor_add_addon_repository/?repository_url=https%3A%2F%2Fgithub.com%2Felcajon-tech%2Frepository-stable
[ha-addons]: https://github.com/elcajon-tech/repository-stable
