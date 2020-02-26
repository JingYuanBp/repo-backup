firewall {
    all-ping enable
    broadcast-ping disable
    config-trap disable
    ipv6-receive-redirects disable
    ipv6-src-route disable
    ip-src-route disable
    log-martians enable
    receive-redirects disable
    send-redirects enable
    source-validation disable
    syn-cookies enable
    twa-hazards-protection disable
}
interfaces {
    ethernet eth0 {
        address 10.48.136.9/24
        duplex auto
        firewall {
            in {
            }
        }
        smp_affinity auto
        speed auto
        vrrp {
            vrrp-group 103 {
                advertise-interval 1
                preempt true
                priority 10
                sync-group syncgroup01
                virtual-address 10.48.136.8/24
            }
        }
    }
    ethernet eth1 {
        address 10.96.7.249/21
        duplex auto
        smp_affinity auto
        speed auto
        vrrp {
            vrrp-group 103 {
                advertise-interval 1
                preempt true
                priority 10
                sync-group syncgroup01
                virtual-address 10.96.7.248/21
            }
        }
    }
    ethernet eth2 {
        address 10.96.15.249/21
        duplex auto
        smp_affinity auto
        speed auto
        vrrp {
            vrrp-group 103 {
                advertise-interval 1
                preempt true
                priority 10
                sync-group syncgroup01
                virtual-address 10.96.15.248/21
            }
        }
    }
    ethernet eth3 {
        address 10.96.23.249/21
        duplex auto
        smp_affinity auto
        speed auto
        vrrp {
            vrrp-group 102 {
                advertise-interval 1
                preempt true
                priority 100
                sync-group syncgroup01
                virtual-address 10.96.23.248/21
            }
        }
    }
    ethernet eth4 {
        address 10.96.31.249/21
        duplex auto
        smp_affinity auto
        speed auto
        vrrp {
            vrrp-group 103 {
                advertise-interval 1
                preempt true
                priority 100
                sync-group syncgroup01
                virtual-address 10.96.31.248/21
            }
        }
    }
    loopback lo {
    }
}
protocols {
    static {
        route 0.0.0.0/0 {
            next-hop 10.48.136.248 {
            }
        }
        route 10.48.144.0/20 {
            next-hop 10.48.136.248 {
            }
        }
        route 10.48.160.0/20 {
            next-hop 10.48.136.248 {
            }
        }
        route 10.128.32.0/20 {
            next-hop 10.96.21.8 {
            }
        }
    }
}
service {
    ssh {
        listen-address 10.48.136.9
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
    domain-name novalocal
    host-name I4-CS90-RTX-HUB01
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
                encrypted-password $1$tmFrZlap$P6mKbd2WZj0W8EDz/OnDI1
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
        host @10.48.64.16 {
            facility all {
                level info
            }
        }
    }
    time-zone UTC
}


/* Warning: Do not remove the following line. */
/* === vyatta-config-version: "cluster@1:config-management@1:conntrack-sync@1:conntrack@1:cron@1:dhcp-relay@1:dhcp-server@4:firewall@5:ipsec@4:nat@4:qos@1:quagga@2:system@6:vrrp@1:wanloadbalance@3:webgui@1:webproxy@1:zone-policy@1" === */
/* Release version: VyOS 1.1.8 */
