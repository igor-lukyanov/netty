/*
 * Copyright 2014 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.channel.epoll;

/**
 * <p>
 * struct mptcp_info
 * {
 *     __u8    mptcpi_subflows; // structure with initial fields added in 5.9
 *     __u8    mptcpi_add_addr_signal;
 *     __u8    mptcpi_add_addr_accepted;
 *     __u8    mptcpi_subflows_max;
 *     __u8    mptcpi_add_addr_signal_max;
 *     __u8    mptcpi_add_addr_accepted_max;
 *     __u32   mptcpi_flags;
 *     __u32   mptcpi_token;
 *     __u64   mptcpi_write_seq;
 *     __u64   mptcpi_snd_una;
 *     __u64   mptcpi_rcv_nxt;
 *     __u8    mptcpi_local_addr_used; // added in 5.12
 *     __u8    mptcpi_local_addr_max; // added in 5.12
 *     __u8    mptcpi_csum_enabled; // added in 5.14
 *     __u32   mptcpi_retransmits; // added in 6.5
 *     __u64   mptcpi_bytes_retrans; //added in 6.5
 *     __u64   mptcpi_bytes_sent; //added in 6.5
 *     __u64   mptcpi_bytes_received; //added in 6.5
 *     __u64   mptcpi_bytes_acked; //added in 6.5
 * };
 * </p>
 */
public final class EpollMpTcpInfo {

    final long[] info = new long[19];

    public int subflows() {
        return (int) info[0];
    }

    public int addAddrSignal() {
        return (int) info[1];
    }

    public int addAddrAccepted() {
        return (int) info[2];
    }

    public int subflowsMax() {
        return (int) info[3];
    }

    public int addAddrSignalMax() {
        return (int) info[4];
    }

    public int addAddrAcceptedMax() {
        return (int) info[5];
    }

    public int flags() {
        return (int) info[6];
    }

    public int token() {
        return (int) info[7];
    }

    public long writeSeq() {
        return info[8];
    }

    public long sndUna() {
        return info[9];
    }

    public long rcvNxt() {
        return info[10];
    }

    public long localAddrUsed() {
        return info[11];
    }

    public long localAddrMax() {
        return info[12];
    }

    public long csumEnabled() {
        return info[13];
    }

    public long retransmits() {
        return info[14];
    }

    public long bytesRetrans() {
        return info[15];
    }

    public long bytesSent() {
        return info[16];
    }

    public long bytesReceived() {
        return info[17];
    }

    public long bytesAcked() {
        return info[18];
    }

}
