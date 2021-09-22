FROM debian:buster-slim

RUN apt-get update && \
    apt-get upgrade && \
    apt-get install -y libguestfs-tools

ENV LIBGUESTFS_BACKEND direct

ENTRYPOINT ["/usr/bin/guestfish"]

CMD ["-h"]