firewall {
    all-ping enable
    broadcast-ping disable
    config-trap disable
    group {
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
    name CCB01-CC0001-EIC01-IN {
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
        rule 31 {
            action accept
            destination {
                address 10.10.0.0/19
            }
            protocol icmp
            source {
                address 0.0.0.0/0
            }
        }
        rule 32 {
            action accept
            destination {
                address 10.32.0.0/16
            }
            protocol icmp
            source {
                address 0.0.0.0/0
            }
        }
        rule 33 {
            action accept
            destination {
                address 10.220.0.0/16
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
        rule 4000 {
            action accept
            destination {
                address 0.0.0.0/0
                port 53
            }
            protocol tcp_udp
            source {
                address 0.0.0.0/0
            }
        }
        rule 4010 {
            action accept
            destination {
                address 0.0.0.0/0
                port 80,443
            }
            protocol tcp
            source {
                address 0.0.0.0/0
            }
        }
        rule 4020 {
            action accept
            destination {
                address 0.0.0.0/0
                port 80,43,2222
            }
            protocol tcp
            source {
                address 0.0.0.0/0
            }
        }
    }
    name CCB01-CC0001-EIC01-LOCAL {
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
    name CCB01-CS01-EIC01-IN {
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
    name CCB01-CS01-EIC01-LOCAL {
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
    name CCB01-CS01-OPE02-IN {
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
    name CCB01-CS01-OPE02-LOCAL {
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
    name CC-EIC01-in {
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
        rule 31 {
            action accept
            destination {
                address 10.10.0.0/19
            }
            protocol icmp
            source {
                address 0.0.0.0/0
            }
        }
        rule 32 {
            action accept
            destination {
                address 10.32.0.0/16
            }
            protocol icmp
            source {
                address 0.0.0.0/0
            }
        }
        rule 33 {
            action accept
            destination {
                address 10.220.0.0/16
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
        rule 4000 {
            action accept
            destination {
                address 0.0.0.0/0
                port 53
            }
            protocol tcp_udp
            source {
                address 0.0.0.0/0
            }
        }
        rule 4010 {
            action accept
            destination {
                address 0.0.0.0/0
                port 80,443
            }
            protocol tcp
            source {
                address 0.0.0.0/0
            }
        }
        rule 4020 {
            action accept
            destination {
                address 0.0.0.0/0
                port 80,43,2222
            }
            protocol tcp
            source {
                address 0.0.0.0/0
            }
        }
        rule 4030 {
            action accept
            destination {
                address !10.0.0.0/8
                port 80,443
            }
            protocol tcp
            source {
                group {
                    network-group individual
                }
            }
        }
        rule 4040 {
            action accept
            destination {
                address 10.32.32.32/24
                port 53
            }
            protocol udp
            source {
                group {
                    network-group individual
                }
            }
        }
        rule 4050 {
            action accept
            description "CaaS Access"
            destination {
                address 10.32.40.24/29
                port 443,8443
            }
            protocol tcp
            source {
                group {
                    network-group individual
                }
            }
        }
    }
    name CC-EIC01-local {
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
    receive-redirects disable
    send-redirects enable
    source-validation disable
    syn-cookies enable
    twa-hazards-protection disable
}
interfaces {
    ethernet eth0 {
        address 10.48.8.13/21
        duplex auto
        firewall {
            in {
                name CCB01-CS01-OPE02-IN
            }
            local {
                name CCB01-CS01-OPE02-LOCAL
            }
        }
        smp_affinity auto
        speed auto
        vrrp {
            vrrp-group 104 {
                advertise-interval 1
                preempt true
                priority 100
                sync-group syncgroup01
                virtual-address 10.48.8.12/21
            }
        }
    }
    ethernet eth1 {
        address 10.32.8.13/24
        duplex auto
        firewall {
            in {
                name CCB01-CS01-EIC01-IN
            }
            local {
                name CCB01-CS01-EIC01-LOCAL
            }
        }
        smp_affinity auto
        speed auto
        vrrp {
            vrrp-group 104 {
                advertise-interval 1
                preempt true
                priority 100
                sync-group syncgroup01
                virtual-address 10.32.8.12/24
            }
        }
    }
    ethernet eth2 {
        address 10.64.5.249/24
        duplex auto
        firewall {
            in {
                name CC-EIC01-in
            }
            local {
                name CC-EIC01-local
            }
        }
        smp_affinity auto
        speed auto
        vrrp {
            vrrp-group 104 {
                advertise-interval 1
                preempt true
                priority 100
                sync-group syncgroup01
                virtual-address 10.64.5.248/24
            }
        }
    }
    ethernet eth3 {
        address 10.64.13.249/24
        duplex auto
        firewall {
            in {
                name CC-EIC01-in
            }
            local {
                name CC-EIC01-local
            }
        }
        smp_affinity auto
        speed auto
        vrrp {
            vrrp-group 104 {
                advertise-interval 1
                preempt true
                priority 100
                sync-group syncgroup01
                virtual-address 10.64.13.248/24
            }
        }
    }
    ethernet eth4 {
        address 10.64.21.249/24
        duplex auto
        firewall {
            in {
                name CC-EIC01-in
            }
            local {
                name CC-EIC01-local
            }
        }
        smp_affinity auto
        speed auto
        vrrp {
            vrrp-group 103 {
                advertise-interval 1
                preempt true
                priority 100
                sync-group syncgroup01
                virtual-address 10.64.21.248/24
            }
        }
    }
    ethernet eth5 {
        address 10.64.29.249/24
        duplex auto
        firewall {
            in {
                name CC-EIC01-in
            }
            local {
                name CC-EIC01-local
            }
        }
        smp_affinity auto
        speed auto
        vrrp {
            vrrp-group 104 {
                advertise-interval 1
                preempt true
                priority 100
                sync-group syncgroup01
                virtual-address 10.64.29.248/24
            }
        }
    }
    ethernet eth6 {
        address 10.64.37.249/24
        duplex auto
        firewall {
            in {
                name CC-EIC01-in
            }
            local {
                name CC-EIC01-local
            }
        }
        smp_affinity auto
        speed auto
        vrrp {
            vrrp-group 104 {
                advertise-interval 1
                preempt true
                priority 100
                sync-group syncgroup01
                virtual-address 10.64.37.248/24
            }
        }
    }
    ethernet eth7 {
        address 10.64.45.249/24
        duplex auto
        firewall {
            in {
                name CC-EIC01-in
            }
            local {
                name CC-EIC01-local
            }
        }
        smp_affinity auto
        speed auto
        vrrp {
            vrrp-group 104 {
                advertise-interval 1
                preempt true
                priority 100
                sync-group syncgroup01
                virtual-address 10.64.45.248/24
            }
        }
    }
    ethernet eth8 {
        address 10.64.53.249/24
        duplex auto
        firewall {
            in {
                name CC-EIC01-in
            }
            local {
                name CC-EIC01-local
            }
        }
        smp_affinity auto
        speed auto
        vrrp {
            vrrp-group 104 {
                advertise-interval 1
                preempt true
                priority 100
                sync-group syncgroup01
                virtual-address 10.64.53.248/24
            }
        }
    }
    ethernet eth9 {
        address 10.64.61.249/24
        duplex auto
        smp_affinity auto
        speed auto
        vrrp {
            vrrp-group 104 {
                advertise-interval 1
                preempt true
                priority 100
                sync-group syncgroup01
                virtual-address 10.64.61.248/24
            }
        }
    }
    loopback lo {
    }
}
protocols {
    static {
        route 0.0.0.0/0 {
            next-hop 10.32.8.248 {
            }
        }
        route 10.8.0.0/16 {
            next-hop 10.48.15.248 {
            }
        }
        route 10.10.0.0/19 {
            next-hop 10.32.8.8 {
            }
        }
        route 10.11.0.0/20 {
            next-hop 10.64.5.8 {
            }
        }
        route 10.11.16.0/22 {
            next-hop 10.64.5.8 {
            }
        }
        route 10.32.0.0/21 {
            next-hop 10.32.8.248 {
            }
        }
        route 10.32.32.0/19 {
            next-hop 10.32.8.8 {
            }
        }
        route 10.32.64.0/19 {
            next-hop 10.32.8.8 {
            }
        }
        route 10.48.64.0/19 {
            next-hop 10.48.15.248 {
            }
        }
        route 10.48.144.0/20 {
            next-hop 10.48.15.248 {
            }
        }
        route 10.48.160.0/20 {
            next-hop 10.48.15.248 {
            }
        }
        route 10.64.16.0/21 {
            next-hop 10.64.21.8 {
            }
        }
        route 10.128.0.0/21 {
            next-hop 10.64.5.8 {
            }
        }
        route 10.128.16.0/20 {
            next-hop 10.64.13.8 {
            }
        }
        route 10.128.32.0/20 {
            next-hop 10.64.21.8 {
            }
        }
        route 10.128.48.0/20 {
            next-hop 10.64.29.8 {
            }
        }
        route 10.128.64.0/20 {
            next-hop 10.64.37.8 {
            }
        }
        route 10.128.80.0/20 {
            next-hop 10.64.45.8 {
            }
        }
        route 10.128.96.0/20 {
            next-hop 10.64.53.8 {
            }
        }
        route 10.128.112.0/20 {
            next-hop 10.64.61.4 {
            }
        }
        route 10.192.1.0/24 {
            next-hop 10.64.61.4 {
            }
        }
        route 10.220.0.0/16 {
            next-hop 10.32.8.8 {
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
    host-name CCB01
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
