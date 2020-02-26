firewall {
    all-ping enable
    broadcast-ping disable
    config-trap disable
    group {
        network-group allow_internet_access {
            network 192.168.0.17/32
        }
        network-group individual {
            network 10.128.0.0/10
            network 10.11.0.0/20
            network 10.11.16.0/22
        }
    }
    ipv6-receive-redirects disable
    ipv6-src-route disable
    ip-src-route disable
    log-martians enable
    name EXT01-CS01-EXT01-IN {
        default-action drop
        rule 10 {
            action accept
            state {
                established enable
                related enable
            }
        }
        rule 20 {
            action drop
            state {
                invalid enable
            }
        }
        rule 30 {
            action accept
            destination {
                address 0.0.0.0/0
            }
            protocol icmp
            source {
                address 0.0.0.0/0
            }
        }
        rule 40 {
            action accept
            destination {
                address 0.0.0.0/0
            }
            protocol vrrp
            source {
                address 0.0.0.0/0
            }
        }
        rule 1010 {
            action accept
            destination {
                address 0.0.0.0/0
            }
            protocol tcp_udp
            source {
                address 10.32.4.0/24
            }
        }
        rule 1020 {
            action accept
            destination {
                address 0.0.0.0/0
                port 80,443
            }
            protocol tcp
            source {
                group {
                    network-group individual
                }
            }
        }
    }
    name EXT01-CS01-EXT01-LOCAL {
        default-action drop
        rule 10 {
            action accept
            state {
                established enable
                related enable
            }
        }
        rule 20 {
            action drop
            state {
                invalid enable
            }
        }
        rule 30 {
            action accept
            destination {
                address 0.0.0.0/0
            }
            protocol icmp
            source {
                address 0.0.0.0/0
            }
        }
        rule 40 {
            action accept
            destination {
                address 0.0.0.0/0
            }
            protocol vrrp
            source {
                address 0.0.0.0/0
            }
        }
    }
    name EXT01-CS01-IGW01-IN {
        default-action drop
        rule 10 {
            action accept
            state {
                established enable
                related enable
            }
        }
        rule 20 {
            action drop
            state {
                invalid enable
            }
        }
        rule 40 {
            action accept
            destination {
                address 0.0.0.0/0
            }
            protocol vrrp
            source {
                address 0.0.0.0/0
            }
        }
        rule 1000 {
            action accept
            destination {
                address 10.32.4.16
                port 80,443
            }
            protocol tcp
            source {
                address 0.0.0.0/0
                group {
                }
            }
        }
    }
    name EXT01-CS01-IGW01-LOCAL {
        default-action drop
        rule 10 {
            action accept
            state {
                established enable
                related enable
            }
        }
        rule 20 {
            action drop
            state {
                invalid enable
            }
        }
        rule 40 {
            action accept
            destination {
                address 0.0.0.0/0
            }
            protocol vrrp
            source {
                address 0.0.0.0/0
            }
        }
    }
    name EXT01-CS01-OPE01-IN {
        default-action drop
        rule 1 {
            action accept
            destination {
                address 0.0.0.0/0
            }
            protocol all
            source {
                address 0.0.0.0/0
            }
        }
        rule 10 {
            action accept
            state {
                established enable
                related enable
            }
        }
        rule 20 {
            action drop
            state {
                invalid enable
            }
        }
        rule 30 {
            action accept
            destination {
                address 0.0.0.0/0
            }
            protocol icmp
            source {
                address 0.0.0.0/0
            }
        }
        rule 40 {
            action accept
            destination {
                address 0.0.0.0/0
            }
            protocol vrrp
            source {
                address 0.0.0.0/0
            }
        }
    }
    name EXT01-CS01-OPE01-LOCAL {
        default-action drop
        rule 1 {
            action accept
            destination {
                address 0.0.0.0/0
            }
            protocol all
            source {
                address 0.0.0.0/0
            }
        }
        rule 10 {
            action accept
            state {
                established enable
                related enable
            }
        }
        rule 20 {
            action drop
            state {
                invalid enable
            }
        }
        rule 30 {
            action accept
            destination {
                address 0.0.0.0/0
            }
            protocol icmp
            source {
                address 0.0.0.0/0
            }
        }
        rule 40 {
            action accept
            destination {
                address 0.0.0.0/0
            }
            protocol vrrp
            source {
                address 0.0.0.0/0
            }
        }
    }
    receive-redirects disable
    send-redirects enable
    source-validation disable
    syn-cookies enable
    twa-hazards-protection disable
}
interfaces {
    ethernet eth0 {
        address 10.48.0.9/21
        duplex auto
        firewall {
            in {
                name EXT01-CS01-OPE01-IN
            }
            local {
                name EXT01-CS01-OPE01-LOCAL
            }
        }
        smp_affinity auto
        speed auto
        vrrp {
            vrrp-group 102 {
                advertise-interval 1
                preempt true
                priority 100
                rfc3768-compatibility
                sync-group syncgroup01
                virtual-address 10.48.0.8/21
            }
        }
    }
    ethernet eth1 {
        address 10.32.0.9/24
        duplex auto
        firewall {
            in {
                name EXT01-CS01-IGW01-IN
            }
            local {
                name EXT01-CS01-IGW01-LOCAL
            }
        }
        smp_affinity auto
        speed auto
        vrrp {
            vrrp-group 102 {
                advertise-interval 1
                preempt true
                priority 100
                rfc3768-compatibility
                sync-group syncgroup01
                virtual-address 10.32.0.8/24
            }
        }
    }
    ethernet eth2 {
        address 10.32.4.249/24
        duplex auto
        firewall {
            in {
                name EXT01-CS01-EXT01-IN
            }
            local {
                name EXT01-CS01-EXT01-LOCAL
            }
        }
        smp_affinity auto
        speed auto
        vrrp {
            vrrp-group 102 {
                advertise-interval 1
                preempt true
                priority 100
                rfc3768-compatibility
                sync-group syncgroup01
                virtual-address 10.32.4.248/24
            }
        }
    }
    loopback lo {
    }
}
nat {
    destination {
        rule 110 {
            destination {
                address 180.12.185.5
            }
            inbound-interface eth1
            source {
                address !10.32.0.0/24
            }
            translation {
                address 10.32.4.16
            }
        }
    }
    source {
        rule 100 {
            outbound-interface eth1
            source {
                address !10.32.0.0/24
            }
            translation {
                address 180.12.185.5
            }
        }
        rule 120 {
            destination {
                address 10.32.4.16
            }
            disable
            outbound-interface eth2
            source {
                address !10.0.0.0/8
            }
            translation {
                address 10.32.4.248
            }
        }
    }
}
protocols {
    static {
        route 0.0.0.0/0 {
            next-hop 10.32.0.248 {
            }
        }
        route 10.8.0.0/16 {
            next-hop 10.48.7.248 {
            }
        }
        route 10.11.0.0/20 {
            next-hop 10.32.4.8 {
            }
        }
        route 10.11.16.0/22 {
            next-hop 10.32.4.8 {
            }
        }
        route 10.48.64.0/19 {
            next-hop 10.48.7.248 {
            }
        }
        route 10.48.144.0/20 {
            next-hop 10.48.7.248 {
            }
        }
        route 10.48.160.0/20 {
            next-hop 10.48.7.248 {
            }
        }
        route 10.128.0.0/10 {
            next-hop 10.32.4.8 {
            }
        }
        route 192.168.0.0/24 {
            next-hop 10.32.0.244 {
            }
        }
    }
}
service {
    ssh {
        port 22
    }
}
system {
    config-management {
        commit-revisions 20
    }
    console {
        device ttyS0 {
            speed 9600
        }
    }
    host-name EXT01
    login {
        user i4admin {
            authentication {
                encrypted-password !
                plaintext-password ""
                public-keys i4admin@i4square.net {
                    key AAAAB3NzaC1yc2EAAAADAQABAAABAQDO0gdak8Enwfi8A6lg3FqJRomEMlBfeeb2f1v0ll7mQzN/RMYIBN0AkKxvFdbfGmvqRkjRYgeKnF5NK/viBI1Ul4zt6SvKUmgJljzxlZJUeqI4OQ6NIYFtLnrjlXU8bCHSDuJBYY5FQapG9nRxfZGhw/KPu5AR8x525daRqECV0fRjvXfcMTf+vAtMMSknTPc417haYrqri1xvJIhFeKC8pTmLNgQf9y4PLSAYYEqfR3Bn5Gx3ulFIL8eZgOJMrvGusgNsbl8SA0rxEcUnjZOszSZHwHwQTRLm4tcAnE8U+SDcoCTgU3QKbiAJ1b1+/nO7vRcfAzmvyWlCG4hgdSld
                    type ssh-rsa
                }
            }
            level admin
        }
        user vyos {
            authentication {
                encrypted-password $1$nvsHSj.0$jfBQt0d7xz1PTMyeg7lZw/
                plaintext-password ""
            }
            level admin
        }
    }
    ntp {
        server 169.254.127.1 {
        }
    }
    package {
        auto-sync 0
        repository community {
            components main
            distribution helium
            password ""
            url http://packages.vyos.net/vyos
            username ""
        }
    }
    syslog {
        global {
            facility all {
                level notice
            }
            facility protocols {
                level debug
            }
        }
        host 10.48.64.16 {
            facility all {
                level notice
            }
        }
    }
    task-scheduler {
        task garp {
            crontab-spec "*/1 * * * *"
            executable {
                path /config/scripts/garp.sh
            }
        }
    }
    time-zone UTC
}


/* Warning: Do not remove the following line. */
/* === vyatta-config-version: "cluster@1:config-management@1:conntrack-sync@1:conntrack@1:cron@1:dhcp-relay@1:dhcp-server@4:firewall@5:ipsec@4:nat@4:qos@1:quagga@2:system@6:vrrp@1:wanloadbalance@3:webgui@1:webproxy@1:zone-policy@1" === */
/* Release version: VyOS 1.1.8 */
